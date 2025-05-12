import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());

		int[] dp = new int[Y + 1];
		dp[0] = H;
		for (int t = 1; t <= Y; t++) {
			int best = (int) Math.floor(dp[t - 1] * 1.05);
			if (t >= 3) {
				best = Math.max(best, (int) Math.floor(dp[t - 3] * 1.2));
			}
			if (t >= 5) {
				best = Math.max(best, (int) Math.floor(dp[t - 5] * 1.35));
			}
			dp[t] = best;
		}
		System.out.println(dp[Y]);
	}
}