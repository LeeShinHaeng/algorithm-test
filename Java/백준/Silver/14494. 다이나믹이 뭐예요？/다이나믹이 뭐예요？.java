import java.io.BufferedReader;
import java.io.InputStreamReader;
// https://www.acmicpc.net/problem/14494
class Main {
	static long[][] memo = new long[1001][1001];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		init();
		System.out.println(memo[N][M]);
	}

	public static void init() {
		for (int i = 0; i < 1001; i++) {
			memo[i][1] = 1;
			memo[1][i] = 1;
		}
		for (int i = 2; i < 1001; i++) {
			for (int j = 2; j < 1001; j++) {
				memo[i][j] = (memo[i - 1][j - 1] + memo[i - 1][j] + memo[i][j - 1]) % (1_000_000_007);
			}
		}
	}
}