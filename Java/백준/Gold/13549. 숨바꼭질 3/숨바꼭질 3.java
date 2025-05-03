import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int start = Integer.parseInt(s[0]);
		int goal = Integer.parseInt(s[1]);
		int[] map = new int[100_001];
		Arrays.fill(map, 100_000);
		map[start] = 0;

		Deque<Integer> deque = new ArrayDeque<>();
		deque.add(start);

		while (!deque.isEmpty()) {
			int cur = deque.poll();
			if (cur == goal) break;

			int next = cur * 2;
			if (next <= 100_000 && map[next] > map[cur]) {
				deque.add(next);
				map[next] = map[cur];
			}

			next = cur + 1;
			if (next <= 100_000 && map[next] > (map[cur] + 1)) {
				deque.add(next);
				map[next] = map[cur] + 1;
			}

			next = cur - 1;
			if (next >= 0 && map[next] > (map[cur] + 1)) {
				deque.add(next);
				map[next] = map[cur] + 1;
			}
		}

		System.out.println(map[goal]);
	}
}