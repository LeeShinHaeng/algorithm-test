import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	static Map<String, Integer> map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input;
		map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			input = br.readLine().split(" ");
			calc(input, 4);
			input = br.readLine().split(" ");
			calc(input, 6);
			input = br.readLine().split(" ");
			calc(input, 4);
			input = br.readLine().split(" ");
			calc(input, 10);
		}

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int v : map.values()) {
			min = Math.min(min, v);
			max = Math.max(max, v);
		}
		System.out.println((max - min <= 12) ? "Yes" : "No");
	}

	private static void calc(String[] input, int time) {
		for (String s : input) {
			if (s.equals("-")) continue;
			map.put(s, map.getOrDefault(s, 0) + time);
		}
	}
}