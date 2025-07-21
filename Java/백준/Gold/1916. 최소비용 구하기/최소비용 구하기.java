import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static Map<Integer, List<Edge>> edges = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			edges.put(i, new ArrayList<>());
		}

		StringTokenizer st;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());

			edges.get(u).add(new Edge(u, v, w));
		}

		st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		
		long[] dist = new long[N + 1];
		boolean[] visited = new boolean[N + 1];

		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[S] = 0;

		PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparing(n -> n.dist));
		pq.offer(new Node(S, dist[S]));

		while (!pq.isEmpty()) {
			Node node = pq.poll();
			int u = node.vertex;

			if (u == E) break;

			if (visited[u]) continue;
			visited[u] = true;

			for (Edge edge : edges.get(u)) {
				int v = edge.to;
				int w = edge.weight;
				if (!visited[v] && dist[v] > dist[u] + w) {
					dist[v] = dist[u] + w;
					pq.offer(new Node(v, dist[v]));
				}
			}
		}

		System.out.println(dist[E]);
	}
}

class Edge {
	int from;
	int to;
	int weight;

	public Edge(int from, int to, int weight) {
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
}

class Node {
	int vertex;
	long dist;

	Node(int vertex, long dist) {
		this.vertex = vertex;
		this.dist = dist;
	}
}