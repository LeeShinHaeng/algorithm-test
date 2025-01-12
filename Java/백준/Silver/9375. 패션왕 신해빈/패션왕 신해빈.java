import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int count = 1;
			Map<String, Integer> map = new HashMap<>();
			int N = Integer.parseInt(br.readLine());
			for (int j = 0; j < N; j++) {
				String[] s = br.readLine().split(" ");
				map.put(s[1], map.getOrDefault(s[1], 0) + 1);
			}

			for (int value : map.values()) {
				count *= (value + 1);
			}
			count -= 1;

			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}