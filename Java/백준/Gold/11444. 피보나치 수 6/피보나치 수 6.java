import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static final long MOD = 1000000007;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long[] result = fib(n);
		System.out.println(result[0]);
	}

	// F(2k) = F(k) × [2×F(k+1) − F(k)]
	// F(2k+1) = F(k+1)^2 + F(k)^2
	static long[] fib(long n) {
		if (n == 0) return new long[]{0, 1};                     // base case
		long[] half = fib(n / 2);
		long a = half[0];                                        // F(n/2)
		long b = half[1];                                        // F(n/2 + 1)
		long c = (a * ((2 * b % MOD + MOD - a) % MOD)) % MOD;    // F(2k)
		long d = ((a * a) % MOD + (b * b) % MOD) % MOD;          // F(2k+1)

		// [F(n), F(n+1)]을 반환
		if (n % 2 == 0) {
			return new long[]{c, d};
		} else {
			return new long[]{d, (c + d) % MOD};
		}
	}
}