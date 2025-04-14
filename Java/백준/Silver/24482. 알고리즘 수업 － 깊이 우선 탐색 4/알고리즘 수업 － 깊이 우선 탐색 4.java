import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	static Map<Integer, Node> map;
	static int N;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		int R = Integer.parseInt(input[2]);

		visited = new boolean[N + 1];
		map = new HashMap<>();
		for (int i = 1; i <= N; i++) {
			map.put(i, new Node(i));
		}

		for (int i = 0; i < M; i++) {
			input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			map.get(x).connections.add(map.get(y));
			map.get(y).connections.add(map.get(x));
		}

		for (int i = 1; i <= N; i++) {
			map.get(i).connections.sort((n1, n2) -> n2.n - n1.n);
		}

		map.get(R).depth = 0;
		dfs(R);

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			sb.append(map.get(i).depth).append("\n");
		}
		System.out.println(sb);
	}

	private static void dfs(int root) {
		visited[root] = true;
		Node current = map.get(root);
		for (Node next : current.connections) {
			if (!visited[next.n]) {
				next.depth = current.depth + 1;
				dfs(next.n);
			}
		}
	}
}

class Node {
	public int n;
	public List<Node> connections;
	public int depth;

	public Node(int n) {
		this.n = n;
		this.connections = new ArrayList<>();
		depth = -1;
	}
}