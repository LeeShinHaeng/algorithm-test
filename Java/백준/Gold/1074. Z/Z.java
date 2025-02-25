import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int weight;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int r = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);
		int len = (int) Math.pow(2, n);
		weight = 0;
		recursiveCalc(len, r, c);
		System.out.println(weight);
	}

	private static void recursiveCalc(int len, int r, int c) {
		// base case
		if (len == 2) {
			if (r == 0) {
				if (c == 0)
					return;
				weight += 1;
				return;
			}
			if (c == 0) {
				weight += 2;
				return;
			}
			weight += 3;
			return;
		}

		int center = len / 2;

		// 좌상단
		if (center > r && center > c) {
			recursiveCalc(center, r, c);
			return;
		}
		// 우상단
		if (center > r) {
			weight += (center * center);
			recursiveCalc(center, r, c - center);
			return;
		}
		// 좌하단
		if (center > c) {
			weight += 2 * (center * center);
			recursiveCalc(center, r - center, c);
			return;
		}
		// 우하단
		weight += 3 * (center * center);
		recursiveCalc(center, r - center, c - center);
		return;
	}
}