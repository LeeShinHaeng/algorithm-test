import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main {
	static Map<String, String> memo = new HashMap<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int t = Integer.parseInt(input[1]);
		String s = br.readLine();

		String result = findMax(s, t);
		System.out.println(result);
	}

	private static String findMax(String s, int t) {
		if (t == 0)
			return s;

		String key = s + "," + t;
		if (memo.containsKey(key)) {
			return memo.get(key);
		}

		int length = s.length();
		int half = length / 2;

		String left = s.substring(0, half);
		String right = s.substring(half, length);

		String maxLeft = findMax(left, t - 1);
		String maxRight = findMax(right, t - 1);

		String max = maxLeft.compareTo(maxRight) > 0 ? maxLeft : maxRight;
		memo.put(key, max);
		return max;
	}
}