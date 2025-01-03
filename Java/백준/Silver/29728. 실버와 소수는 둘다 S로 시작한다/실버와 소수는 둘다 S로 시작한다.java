import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	static boolean[] isPrime;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		isPrime = new boolean[n + 1];
		init();

		int countB = 0;
		int countS = 0;

		boolean isLastB = false;

		for (int i = 1; i <= n; i++) {
			if (isPrime[i]) {
				if (isLastB) {
					countB--;
					countS += 2;
				} else {
					countS++;
				}
				isLastB = false;
			} else {
				countB++;
				isLastB = true;
			}
		}

		System.out.println(countB + " " + countS);
	}

	private static void init() {
		Arrays.fill(isPrime, true);

		isPrime[0] = false;
		isPrime[1] = false;

		for (int i = 2; i <= Math.sqrt(isPrime.length - 1); i++) {
			if (isPrime[i]) {
				for (int j = i * i; j < isPrime.length; j += i) {
					isPrime[j] = false;
				}
			}
		}
	}
}