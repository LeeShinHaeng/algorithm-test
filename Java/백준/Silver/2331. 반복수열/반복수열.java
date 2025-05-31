import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static int P;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer((br.readLine()));
		int A = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());

		int[] dp = new int[100_000];
		Map<Integer, Integer> map = new HashMap<>();
		dp[0] = A;
		map.put(A, 0);

		int index = 1;
		while (true) {
			int tmp = findNext(dp[index - 1]);
			if (map.containsKey(tmp)) {
				index = map.get(tmp);
				break;
			}
			dp[index] = tmp;
			map.put(tmp, index++);
		}

		System.out.println(index);
	}

	private static int findNext(int cur) {
		int result = 0;

		while (cur > 0) {
			result += (int) Math.pow(cur % 10, P);
			cur /= 10;
		}

		return result;
	}
}