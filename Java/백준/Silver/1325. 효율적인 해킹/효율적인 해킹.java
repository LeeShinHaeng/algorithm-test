import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static List<Integer>[] graph;
	static int[] visited, counts;
	static int visitToken = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		graph = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++)
			graph[i] = new ArrayList<>();

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			graph[B].add(A);
		}

		visited = new int[N + 1];
		counts = new int[N + 1];

		int max = 0;
		for (int i = 1; i <= N; i++) {
			visitToken++;
			int cnt = bfs(i);
			counts[i] = cnt;
			max = Math.max(max, cnt);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			if (counts[i] == max)
				sb.append(i).append(' ');
		}
		System.out.println(sb);
	}

	private static int bfs(int start) {
		int count = 1;
		Deque<Integer> q = new ArrayDeque<>();
		q.add(start);
		visited[start] = visitToken;

		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int next : graph[cur]) {
				if (visited[next] != visitToken) {
					visited[next] = visitToken;
					count++;
					q.add(next);
				}
			}
		}
		return count;
	}
}