import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[] prices = new int[N];
			String[] input = br.readLine().split(" ");

			for (int i = 0; i < N; i++) {
				prices[i] = Integer.parseInt(input[i]);
			}

			// 역순 탐색으로 최대 이익 계산
			long maxProfit = 0; // 최대 이익
			int maxPrice = 0;   // 현재까지의 최대 주가

			for (int i = N - 1; i >= 0; i--) {
				if (prices[i] > maxPrice) {
					maxPrice = prices[i]; // 최대값 갱신
				} else {
					maxProfit += maxPrice - prices[i]; // 이익 계산
				}
			}

			sb.append(maxProfit).append("\n");
		}

		System.out.println(sb);
	}
}