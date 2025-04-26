import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		while (N != 0) {
			int cur;
			int[] dp = new int[N];
			int maxSum = Integer.MIN_VALUE;
			dp[0] = Integer.parseInt(br.readLine());
			for (int i = 1; i < N; i++) {
				cur = Integer.parseInt(br.readLine());
				dp[i] = Math.max(cur, dp[i - 1] + cur);
				if (maxSum < dp[i]) maxSum = dp[i];
			}

			sb.append(maxSum).append("\n");
			N = Integer.parseInt(br.readLine());
		}
		System.out.println(sb);
	}
}