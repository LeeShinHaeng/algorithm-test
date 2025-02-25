import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int r = Integer.parseInt(s[1]);
		int c = Integer.parseInt(s[2]);

		int len = (int) Math.pow(2, n);
		System.out.println(recursiveCalc(len, r, c, 0));
	}

	private static int recursiveCalc(int len, int r, int c, int weight) {
		// base case
		if (len == 2) {
			if (r == 0) {
				if (c == 0)
					return weight;
				return weight + 1;
			}
			if (c == 0)
				return weight + 2;
			return weight + 3;
		}

		int center = len / 2;

		// 좌상단
		if (center > r && center > c)
			return recursiveCalc(center, r, c, weight);

		// 우상단
		if (center > r)
			return recursiveCalc(center, r, c - center, weight + (center * center));

		// 좌하단
		if (center > c)
			return recursiveCalc(center, r - center, c, weight + 2 * (center * center));

		// 우하단
		return recursiveCalc(center, r - center, c - center, weight + 3 * (center * center));
	}
}