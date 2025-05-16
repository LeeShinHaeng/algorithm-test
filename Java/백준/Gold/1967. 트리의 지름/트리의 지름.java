import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static class Node {
		int to, weight;

		Node(int to, int weight) {
			this.to = to;
			this.weight = weight;
		}
	}

	static List<List<Node>> graph;
	static boolean[] visited;
	static int farthestNode, maxDist;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		graph = new ArrayList<>();
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < N - 1; i++) {
			String[] in = br.readLine().split(" ");
			int u = Integer.parseInt(in[0]);
			int v = Integer.parseInt(in[1]);
			int w = Integer.parseInt(in[2]);
			graph.get(u).add(new Node(v, w));
			graph.get(v).add(new Node(u, w));
		}

		// 1번 노드에서 가장 먼 A (지름의 한쪽 끝) 찾기
		visited = new boolean[N + 1];
		maxDist = 0;
		dfs(1, 0);

		// A에서 가장 먼 B 찾기
		visited = new boolean[N + 1];
		maxDist = 0;
		dfs(farthestNode, 0);

		System.out.println(maxDist);
	}

	static void dfs(int node, int dist) {
		visited[node] = true;
		if (dist > maxDist) {
			maxDist = dist;
			farthestNode = node;
		}
		for (Node n : graph.get(node)) {
			if (!visited[n.to]) {
				dfs(n.to, dist + n.weight);
			}
		}
	}
}