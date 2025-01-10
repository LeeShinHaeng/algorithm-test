import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int k = 0;
		try {
			k = Integer.parseInt(s[2]);
		} catch (Exception ignored) {}

		if (k == 0) {
			System.out.println(calc(n, m));
			return;
		}

		int row = (k - 1) / m + 1;
		int col = (k - 1) % m + 1;

		long num1 = calc(row, col);
		long num2 = calc(n - row + 1, m - col + 1);
		System.out.println(num1 * num2);
	}

	private static long calc(int row, int col) {
		if (row == 0 || col == 0) return 1;

		long[][] arr = new long[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0 || j == 0) {
					arr[i][j] = 1;
					continue;
				}
				arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
			}
		}
		return arr[row - 1][col - 1];
	}
}