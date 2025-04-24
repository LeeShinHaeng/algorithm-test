import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int N, M;
	static int[] input, output;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		M = Integer.parseInt(line[1]);
		input = new int[N];
		output = new int[M];
		visited = new boolean[N];

		line = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			input[i] = Integer.parseInt(line[i]);
		}

		Arrays.sort(input);

		dfs(0);
		System.out.print(sb);
	}

	private static void dfs(int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(output[i]).append(' ');
			}
			sb.append('\n');
			return;
		}

		int prev = -1;
		for (int i = 0; i < N; i++) {
			if (visited[i] || input[i] == prev) continue;

			output[depth] = input[i];
			prev = input[i];

			visited[i] = true;
			dfs(depth + 1);
			visited[i] = false;
		}
	}
}