import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		int min6 = Integer.MAX_VALUE;
		int min1 = Integer.MAX_VALUE;
		for (int i = 0; i < M; i++) {
			input = br.readLine().split(" ");
			min6 = Math.min(min6, Integer.parseInt(input[0]));
			min1 = Math.min(min1, Integer.parseInt(input[1]));
		}

		int packages = N / 6;
		int remainder = N % 6;

		int case1 = packages * min6 + remainder * min1;
		int case2 = (packages + 1) * min6;
		int case3 = N * min1;

		int result = Math.min(Math.min(case1, case2), case3);

		System.out.println(result);
	}
}