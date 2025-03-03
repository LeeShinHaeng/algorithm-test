import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> calendar = new HashMap<>();
		for (int i = 1; i <= 365; i++)
			calendar.put(i, 0);

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String[] input = br.readLine().split(" ");
			int s = Integer.parseInt(input[0]);
			int e = Integer.parseInt(input[1]);

			for (int j = s; j <= e; j++)
				calendar.put(j, calendar.get(j) + 1);
		}

		int sum = 0, days = 0, depth = 0;
		for (int i = 1; i <= 365; i++) {
			if (calendar.get(i) == 0) {
				sum += days * depth;
				days = 0;
				depth = 0;
				continue;
			}
			days++;
			depth = Math.max(calendar.get(i), depth);
		}
		sum += days * depth;
		System.out.println(sum);
	}
}