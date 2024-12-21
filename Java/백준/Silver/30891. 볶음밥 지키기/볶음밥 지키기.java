import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int R = Integer.parseInt(input[1]);
		int[][] rices = new int[N][2];

		for (int i = 0; i < N; i++) {
			input = br.readLine().split(" ");
			rices[i][0] = Integer.parseInt(input[0]);
			rices[i][1] = Integer.parseInt(input[1]);
		}

		int maxX = 0, maxY = 0, maxValue = 0, cur;
		for (int i = -100; i <= 100; i++) {
			for (int j = -100; j <= 100; j++) {
				cur = 0;
				for (int[] r : rices) {
					int distance = (r[0] - i) * (r[0] - i) + (r[1] - j) * (r[1] - j);
					if (distance <= R * R) {
						cur++;
					}
				}
				if (cur > maxValue) {
					maxValue = cur;
					maxX = i;
					maxY = j;
				}
			}
		}

		System.out.println(maxX + " " + maxY);
	}
}