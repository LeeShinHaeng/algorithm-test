import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
	static int N, M, X;
	static Map<Integer, Integer>[] graph;
	static Map<Integer, Integer>[] reverseGraph;
	static int[] go;
	static int[] back;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		N = Integer.parseInt(s[0]);
		M = Integer.parseInt(s[1]);
		X = Integer.parseInt(s[2]);

		graph = new HashMap[N + 1];
		reverseGraph = new HashMap[N + 1];
		for (int i = 1; i <= N; i++) {
			graph[i] = new HashMap<>();
			reverseGraph[i] = new HashMap<>();
		}

		for (int i = 0; i < M; i++) {
			s = br.readLine().split(" ");
			int u = Integer.parseInt(s[0]);
			int v = Integer.parseInt(s[1]);
			int w = Integer.parseInt(s[2]);
			graph[u].put(v, w);
			reverseGraph[v].put(u, w);
		}

		go = new int[N + 1];
		back = new int[N + 1];
		Arrays.fill(go, Integer.MAX_VALUE);
		Arrays.fill(back, Integer.MAX_VALUE);

		dijkstra(graph, back, X);
		dijkstra(reverseGraph, go, X);

		int max = 0;
		for (int i = 1; i <= N; i++) {
			max = Math.max(max, go[i] + back[i]);
		}
		System.out.println(max);
	}

	private static void dijkstra(Map<Integer, Integer>[] graph, int[] dist, int start) {
		PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
		dist[start] = 0;
		pq.offer(new int[]{start, 0});

		while (!pq.isEmpty()) {
			int[] cur = pq.poll();
			int u = cur[0], d = cur[1];
			if (d > dist[u]) continue;

			for (Map.Entry<Integer, Integer> e : graph[u].entrySet()) {
				int v = e.getKey();
				int w = e.getValue();
				if (dist[v] > dist[u] + w) {
					dist[v] = dist[u] + w;
					pq.offer(new int[]{v, dist[v]});
				}
			}
		}
	}
}