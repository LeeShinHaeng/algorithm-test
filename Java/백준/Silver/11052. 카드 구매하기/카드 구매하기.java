import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] nums = new int[N + 1];
		for (int i = 1; i <= N; i++)
			nums[i] = Integer.parseInt(input[i - 1]);

		int[] dp = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i] = Math.max(dp[i], dp[i - j] + nums[j]);
			}
		}

		System.out.println(dp[N]);
	}
}