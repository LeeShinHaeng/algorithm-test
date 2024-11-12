import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node implements Comparable<Node> {
	int id;
	List<Node> links;
	boolean visited;

	Node(int id) {
		this.id = id;
		links = new ArrayList<>();
		visited = false;
	}

	void link(Node node) {
		links.add(node);
	}

	@Override
	public int compareTo(Node other) {
		return this.id - other.id;
	}
}

public class Main {
	static Node[] nodes;
	static StringBuilder dfsResult = new StringBuilder();
	static StringBuilder bfsResult = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		int V = Integer.parseInt(input[2]);

		nodes = new Node[N + 1];
		for (int i = 1; i <= N; i++) {
			nodes[i] = new Node(i);
		}

		for (int i = 0; i < M; i++) {
			input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			nodes[a].link(nodes[b]);
			nodes[b].link(nodes[a]);
		}

		for (int i = 1; i <= N; i++) {
			Collections.sort(nodes[i].links);
		}
		dfs(nodes[V]);
		for (int i = 1; i <= N; i++) {
			nodes[i].visited = false;
		}
		bfs(nodes[V]);

		System.out.println(dfsResult.toString() + "\n" + bfsResult.toString());
	}

	public static void dfs(Node node) {
		if (node.visited)
			return;

		node.visited = true;
		dfsResult.append(node.id).append(" ");
		for (Node link : node.links) {
			dfs(link);
		}
	}

	public static void bfs(Node start) {
		Queue<Node> queue = new LinkedList<>();
		start.visited = true;
		queue.offer(start);

		while (!queue.isEmpty()) {
			Node current = queue.poll();
			current.visited = true;
			bfsResult.append(current.id).append(" ");

			for (Node link : current.links) {
				if (link.visited || queue.contains(link)) {
					continue;
				}
				queue.offer(link);
			}
		}
	}
}