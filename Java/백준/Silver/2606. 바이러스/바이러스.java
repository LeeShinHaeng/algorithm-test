import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		List<List<Integer>> lists = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			lists.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			String[] s = br.readLine().split(" ");
			lists.get(Integer.parseInt(s[0])).add(Integer.parseInt(s[1]));
			lists.get(Integer.parseInt(s[1])).add(Integer.parseInt(s[0]));
		}

		System.out.println(bfs(lists));
	}

	private static int bfs(List<List<Integer>> lists) {
		int count = -1;
		boolean[] visited = new boolean[lists.size()];
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);

		while (!queue.isEmpty()) {
			int cur = queue.poll();
			count++;
			visited[cur] = true;
			for (int i : lists.get(cur)) {
				if (visited[i] || queue.contains(i)) {
					continue;
				}
				queue.offer(i);
			}
		}

		return count;
	}
}