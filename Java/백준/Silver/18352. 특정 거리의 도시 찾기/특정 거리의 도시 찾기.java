import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	static Node[] nodes;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		int K = Integer.parseInt(input[2]);
		int X = Integer.parseInt(input[3]);

		nodes = new Node[N + 1];
		for (int i = 0; i <= N; i++) {
			nodes[i] = new Node(i, Integer.MAX_VALUE);
		}

		for (int i = 0; i < M; i++) {
			input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);

			nodes[a].links.add(nodes[b]);
		}

		bfs(X);

		StringBuilder sb = new StringBuilder();
		for (Node node : nodes) {
			if (node.depth == K)
				sb.append(node.number).append("\n");
		}
		if (sb.length() == 0) {
			System.out.println(-1);
		}
		System.out.println(sb);
	}

	private static void bfs(int start) {
		Queue<Node> queue = new LinkedList<>();
		queue.offer(nodes[start]);
		nodes[start].visited = true;
		nodes[start].depth = 0;

		while (!queue.isEmpty()) {
			Node node = queue.poll();
			for (Node link : node.links) {
				if (!link.visited) {
					link.visited = true;
					link.depth = node.depth + 1;
					queue.offer(link);
				}
			}
		}
	}
}

class Node {
	int number;
	int depth;
	boolean visited;
	List<Node> links;

	public Node(int number, int depth) {
		this.number = number;
		this.depth = depth;
		this.visited = false;
		links = new ArrayList<>();
	}
}