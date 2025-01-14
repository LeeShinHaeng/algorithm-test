import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int MOD = 1_234_567;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] dp = initializeDP();

		StringBuilder sb = new StringBuilder();
		for (int t = 0; t < T; t++) {
			int num = Integer.parseInt(br.readLine());
			int count = 0;
			for (int i = 0; i < 10; i++) {
				count = (count + dp[num][i]) % MOD;
			}

			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}

	private static int[][] initializeDP() {
		int[][] dp = new int[1001][10];
		Arrays.fill(dp[1], 1);

		for (int i = 2; i <= 1000; i++) {
			dp[i][0] = dp[i - 1][7] % MOD;
			dp[i][1] = (dp[i - 1][2] + dp[i - 1][4]) % MOD;
			dp[i][2] = (dp[i - 1][1] + dp[i - 1][3] + dp[i - 1][5]) % MOD;
			dp[i][3] = (dp[i - 1][2] + dp[i - 1][6]) % MOD;
			dp[i][4] = (dp[i - 1][1] + dp[i - 1][5] + dp[i - 1][7]) % MOD;
			dp[i][5] = (dp[i - 1][2] + dp[i - 1][4] + dp[i - 1][6] + dp[i - 1][8]) % MOD;
			dp[i][6] = (dp[i - 1][3] + dp[i - 1][5] + dp[i - 1][9]) % MOD;
			dp[i][7] = (dp[i - 1][4] + dp[i - 1][8] + dp[i - 1][0]) % MOD;
			dp[i][8] = (dp[i - 1][5] + dp[i - 1][7] + dp[i - 1][9]) % MOD;
			dp[i][9] = (dp[i - 1][6] + dp[i - 1][8]) % MOD;
		}

		return dp;
	}
}