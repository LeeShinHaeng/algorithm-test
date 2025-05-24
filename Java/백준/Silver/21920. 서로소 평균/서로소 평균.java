import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int MAX = 1_000_001;
	static boolean[] isCoprime = new boolean[MAX];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(br.readLine());
		long sum = 0;
		int count = 0;

		init(X);

		for (int a : arr) {
			if (isCoprime[a]) {
				count++;
				sum += a;
			}
		}
		System.out.println(sum / (double) count);
	}

	private static void init(int x) {
		Arrays.fill(isCoprime, true);
		for (int i = 2; i <= x; i++) {
			if (x % i == 0) {
				isCoprime[i] = false;
				for (int j = i + i; j < MAX; j += i)
					isCoprime[j] = false;
			}
		}
	}
}