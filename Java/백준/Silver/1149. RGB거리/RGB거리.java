import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] dp = new int[N][1000];
		String[] home = br.readLine().split(" ");
		dp[0][0] = Integer.parseInt(home[0]);
		dp[0][1] = Integer.parseInt(home[1]);
		dp[0][2] = Integer.parseInt(home[2]);

		for (int i = 1; i < N; i++) {
			home = br.readLine().split(" ");
			dp[i][0] = Integer.parseInt(home[0]);
			dp[i][1] = Integer.parseInt(home[1]);
			dp[i][2] = Integer.parseInt(home[2]);

			dp[i][0] += Math.min(dp[i - 1][1], dp[i - 1][2]);
			dp[i][1] += Math.min(dp[i - 1][0], dp[i - 1][2]);
			dp[i][2] += Math.min(dp[i - 1][0], dp[i - 1][1]);
		}

		System.out.println(Math.min(dp[N - 1][0], Math.min(dp[N - 1][1], dp[N - 1][2])));
	}
}