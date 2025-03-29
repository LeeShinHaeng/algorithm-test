import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		dp = new int[n];
		int[] graph = new int[n];
		for (int i = 0; i < n; i++) {
			graph[i] = Integer.parseInt(input[i]);
		}

		dp[0] = 1;
		for (int i = 1; i < n; i++) {
			if (graph[i] > dp[i - 1]) {
				dp[i] = dp[i - 1] + 1;
			}
			else {
				dp[i] = graph[i];
			}
		}
		Arrays.sort(dp);
		System.out.println(dp[n - 1]);
	}
}