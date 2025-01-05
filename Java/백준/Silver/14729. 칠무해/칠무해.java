import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] list = new int[7];
		for (int i = 0; i < 7; i++) {
			list[i] = (int) (Double.parseDouble(br.readLine()) * 1000);
		}
		Arrays.sort(list);

		for (int i = 7; i < N; i++) {
			int tmp = (int) (Double.parseDouble(br.readLine()) * 1000);
			if (list[6] > tmp) {
				list[6] = tmp;
				Arrays.sort(list);
			}
		}

		for (int i = 0; i < 7; i++) {
			System.out.printf("%.3f\n", list[i] / 1000.0);
		}
	}
}