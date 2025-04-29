import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	static int N;
	static int[] parent;
	static boolean[] visited;
	static List<Integer>[] graph;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		parent = new int[N + 1];
		visited = new boolean[N + 1];
		graph   = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}

		// 입력
		String[] s;
		for (int i = 0; i < N - 1; i++) {
			s = br.readLine().split(" ");
			int u = Integer.parseInt(s[0]);
			int v = Integer.parseInt(s[1]);
			graph[u].add(v);
			graph[v].add(u);
		}

		// 1부터 시작
		bfs(1);

		// 출력
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i <= N; i++)
			sb.append(parent[i]).append("\n");
		System.out.println(sb);
	}

	static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		visited[start] = true;
		q.offer(start);

		while (!q.isEmpty()) {
			int cur = q.poll();
			for (int nxt : graph[cur]) {
				if (!visited[nxt]) {
					visited[nxt] = true;
					parent[nxt]  = cur;
					q.offer(nxt);
				}
			}
		}
	}
}