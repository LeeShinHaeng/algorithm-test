import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		N -= 2;
		long[] nums = new long[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			nums[i] = Integer.parseInt(st.nextToken());

		for (int i = 1; i < N; i++)
			nums[i] = lcm(nums[i - 1], nums[i]);

		System.out.println(nums[N - 1]);
	}

	private static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	private static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}
}