import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	static HashMap<Long, Long> memo = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		System.out.println(dp(N));
	}

	private static long dp(long n) {
		if (n <= 1) return 0;
		if (n == 2) return 1;

		if (memo.containsKey(n)) return memo.get(n);

		long B = n / 2;
		long C = n - B;
		long result = B * C + dp(B) + dp(C);
		memo.put(n, result);
		return result;
	}
}