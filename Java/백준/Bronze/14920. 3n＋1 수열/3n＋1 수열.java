import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 1;

		while (true) {
			if (n == 1) {
				System.out.println(count);
				return;
			}

			if (n % 2 == 0)
				n /= 2;
			else
				n = 3 * n + 1;
			count++;
		}
	}
}