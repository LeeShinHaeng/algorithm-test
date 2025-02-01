import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(pair(N)).append("\n");
		}
		System.out.println(sb);
	}

	private static int pair(int n) {
		// 1인 경우는 바로 1 출력
		if (n == 1) 
			return 1;
		
		int count = 0;
		for (int i = 1; i <= n / 2; i++) {
			// 나누어 떨어지지 않을때는 넘어감
			if (n % i != 0) continue;
			int j = n / i;
			// i가 j보다 커지면 계산 종료
			if (i > j) break;

			if (gcd(i, j) == 1)
				count++;
		}
		return count;
	}

	private static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
}