import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	static long[] dp = new long[51];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		init();
		System.out.println(dp[n]);
	}

	private static void init() {
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 2; i < dp.length; i++) {
			dp[i] = (dp[i-1] + dp[i-2] + 1) % 1_000_000_007;
		}
	}
}