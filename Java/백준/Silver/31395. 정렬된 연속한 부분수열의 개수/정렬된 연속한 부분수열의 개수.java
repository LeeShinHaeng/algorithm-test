import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		String[] input = br.readLine().split(" ");

		if (n == 1) {
			System.out.println("1");
			return;
		}

		boolean[] isDesc = new boolean[n];
		long count = n;

		int before = Integer.parseInt(input[0]);
		for (int i = 1; i < n; i++) {
			int now = Integer.parseInt(input[i]);
			// 오름차순 구간이 끝나면
			if (now < before) {
				isDesc[i] = true;
			}
			before = now;
		}

		int start = 0;
		for (int i = 1; i < n; i++) {
			if (isDesc[i]) {
				// 해당 구간의 길이가 L -> 부분수열의 개수는 (L*(L-1))/2 = dp[L-1]
				int len = i - start;
				count += ((long) len * (len - 1)) / 2;
				start = i;
			}
		}

		// 마지막 오름차순 구간 처리
		int len = n - start;
		count += ((long) len * (len - 1)) / 2;

		System.out.println(count);
	}
}