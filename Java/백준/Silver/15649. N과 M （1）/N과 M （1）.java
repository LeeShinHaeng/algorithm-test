import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N, M;
	static int[] sequence;
	static boolean[] used;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		sequence = new int[M];
		used = new boolean[N + 1];

		dfs(0);
		System.out.println(sb);
	}

	static void dfs(int depth) {
		if (depth == M) {
			for (int i = 0; i < M; i++) {
				sb.append(sequence[i]).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (used[i]) continue;
			sequence[depth] = i;
			used[i] = true;
			dfs(depth + 1);
			used[i] = false;
		}
	}
}