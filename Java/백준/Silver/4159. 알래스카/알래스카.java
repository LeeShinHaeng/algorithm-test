import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) return;

			int[] gas = new int[2 * n];
			for (int i = 0; i < n; i++) {
				gas[i] = Integer.parseInt(br.readLine());
				gas[gas.length - 1 - i] = 2844 - gas[i];
			}

			Arrays.sort(gas);
			boolean flag = false;
			for (int i = 1; i < gas.length; i++) {
				if (gas[i] - gas[i - 1] > 200) {
					flag = true;
					break;
				}
			}
			if (flag)
				System.out.println("IMPOSSIBLE");
			else
				System.out.println("POSSIBLE");
		}
	}
}