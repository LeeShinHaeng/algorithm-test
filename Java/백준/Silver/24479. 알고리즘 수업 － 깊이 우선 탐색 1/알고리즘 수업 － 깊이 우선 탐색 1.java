import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	static int[] order;
	static int orderCounter = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		graph = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++)
			graph[i] = new ArrayList<>();

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph[u].add(v);
			graph[v].add(u);
		}

		for (int i = 1; i <= N; i++)
			Collections.sort(graph[i]);


		visited = new boolean[N + 1];
		order = new int[N + 1];

		dfs(R);

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++)
			sb.append(order[i]).append("\n");
		System.out.print(sb);
	}

	private static void dfs(int current) {
		visited[current] = true;
		order[current] = orderCounter++;

		for (int next : graph[current]) {
			if (!visited[next])
				dfs(next);
		}
	}
}