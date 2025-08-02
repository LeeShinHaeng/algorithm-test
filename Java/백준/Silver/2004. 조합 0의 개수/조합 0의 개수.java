import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());

		long count2 = countXInFactorOfNum(2, N) - countXInFactorOfNum(2, N - M) - countXInFactorOfNum(2, M);
		long count5 = countXInFactorOfNum(5, N) - countXInFactorOfNum(5, N - M) - countXInFactorOfNum(5, M);

		System.out.println(Math.min(count2, count5));
	}

	static public long countXInFactorOfNum(long x, long num) {
		long count = 0;

		while (num >= x) {
			count += num / x;
			num /= x;
		}

		return count;
	}
}