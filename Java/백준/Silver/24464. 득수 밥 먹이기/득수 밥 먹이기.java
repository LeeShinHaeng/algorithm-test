import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static final int MOD = 1_000_000_007;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		long[][] dp = new long[N + 1][5];

		Arrays.fill(dp[1], 1);
		for (int i = 2; i <= N; i++) {
			for (int j = 1; j < 5; j++)
				dp[i][0] = (dp[i][0] + dp[i - 1][j]) % MOD;

			dp[i][1] = ((dp[i - 1][0] + dp[i - 1][3]) % MOD + dp[i - 1][4]) % MOD;
			dp[i][2] = (dp[i - 1][0] + dp[i - 1][4]) % MOD;
			dp[i][3] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
			dp[i][4] = ((dp[i - 1][0] + dp[i - 1][1]) % MOD + dp[i - 1][2]) % MOD;
		}

		long answer = 0;
		for (int i = 0; i < 5; i++)
			answer = (answer + dp[N][i]) % MOD;
		System.out.println(answer);
	}
}