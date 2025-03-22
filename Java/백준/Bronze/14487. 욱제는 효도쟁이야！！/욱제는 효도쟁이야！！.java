import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int max = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int tmp = Integer.parseInt(input[i]);
			max = Math.max(max, tmp);
			sum += tmp;
		}

		System.out.println(sum - max);
	}
}