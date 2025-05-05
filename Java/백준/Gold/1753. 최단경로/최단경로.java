import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	static int[] dist;
	static int INF = Integer.MAX_VALUE / 2, LEN;
	static List<Edge>[] edges;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int V = Integer.parseInt(s[0]);
		int E = Integer.parseInt(s[1]);
		int K = Integer.parseInt(br.readLine());

		// 초기화
		LEN = V + 1;
		dist = new int[LEN];
		Arrays.fill(dist, INF);
		dist[K] = 0;
		edges = new ArrayList[V + 1];
		for (int i = 1; i <= V; i++) {
			edges[i] = new ArrayList<>();
		}

		// 간선 입력
		for (int i = 0; i < E; i++) {
			s = br.readLine().split(" ");
			int u = Integer.parseInt(s[0]);
			int v = Integer.parseInt(s[1]);
			int w = Integer.parseInt(s[2]);
			edges[u].add(new Edge(v, w));
		}

		dijkstra(K);

		// 출력
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < LEN; i++) {
			if (dist[i] == INF)
				sb.append("INF\n");
			else
				sb.append(dist[i]).append("\n");
		}
		System.out.println(sb);
	}

	private static void dijkstra(int start) {
		// 거리순 PQ
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);
		// {현재 거리, 현재 노드}
		pq.offer(new int[]{dist[start], start});

		while (!pq.isEmpty()) {
			int[] cur = pq.poll();
			int curDist = cur[0];
			// 현재 노드
			int u = cur[1];
			// 이미 처리된 최단거리보다 길면 스킵
			if (curDist > dist[u]) continue;

			// u와 연결된 v
			for (Edge e : edges[u]) {
				int v = e.to;
				int w = e.weight;
				// (start -> v) > (start -> u -> v)
				if (dist[v] > dist[u] + w) {
					dist[v] = dist[u] + w;
					pq.offer(new int[]{dist[v], v});
				}
			}
		}
	}
}

class Edge {
	int to;
	int weight;

	public Edge(int to, int weight) {
		this.to = to;
		this.weight = weight;
	}
}