import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		// 초기화
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 1; i <= n; i++) map.put(i, new ArrayList<>());
		boolean[] visited = new boolean[n + 1];
		visited[1] = true;

		// 매핑
		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map.get(a).add(b);
			map.get(b).add(a);
		}

		// 내 친구
		Deque<Integer> que = new ArrayDeque<>();
		List<Integer> first = map.get(1);
		int count = 0;
		for (Integer f : first) {
			que.offer(f);
			count++;
			visited[f] = true;
		}

		// 친구의 친구
		for (Integer q : que) {
			List<Integer> second = map.get(q);
			for (Integer s : second) {
				if (visited[s]) continue;
				visited[s] = true;
				count++;
			}
		}

		System.out.println(count);
	}
}