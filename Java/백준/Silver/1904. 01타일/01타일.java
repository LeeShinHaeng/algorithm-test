import java.util.Scanner;

class Main {
	static int[] fibo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		initFibo();

		System.out.println(fibo[n]);
	}

	private static void initFibo() {
		fibo = new int[1_000_001];
		fibo[1] = 1;
		fibo[2] = 2;
		for (int i = 3; i <= 1_000_000; i++) {
			fibo[i] = (fibo[i - 1] + fibo[i - 2] ) % 15746;
		}
	}
}