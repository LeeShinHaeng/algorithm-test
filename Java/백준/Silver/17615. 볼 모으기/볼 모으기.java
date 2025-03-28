import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int result = Integer.MAX_VALUE;

		int count = 0;
		boolean flag = false;
		for (int i = 0; i < N; i++) {
			if (flag && s.charAt(i) == 'R') {
				count++;
				continue;
			}
			if (s.charAt(i) == 'B')
				flag = true;
		}
		result = Math.min(result, count);

		count = 0;
		flag = false;
		for (int i = 0; i < N; i++) {
			if (flag && s.charAt(i) == 'B') {
				count++;
				continue;
			}
			if (s.charAt(i) == 'R')
				flag = true;
		}
		result = Math.min(result, count);

		count = 0;
		flag = false;
		for (int i = N - 1; i >= 0; i--) {
			if (flag && s.charAt(i) == 'R') {
				count++;
				continue;
			}
			if (s.charAt(i) == 'B')
				flag = true;
		}
		result = Math.min(result, count);

		count = 0;
		flag = false;
		for (int i = N - 1; i >= 0; i--) {
			if (flag && s.charAt(i) == 'B') {
				count++;
				continue;
			}
			if (s.charAt(i) == 'R')
				flag = true;
		}
		result = Math.min(result, count);

		System.out.println(result);
	}
}