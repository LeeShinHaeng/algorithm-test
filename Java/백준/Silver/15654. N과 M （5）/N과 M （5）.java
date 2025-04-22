import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int[] input, output;
	static int N, M;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		N = Integer.parseInt(s[0]);
		M = Integer.parseInt(s[1]);
		input = new int[N];
		output = new int[M];
		visited = new boolean[N];
		s = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			input[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(input);
        
		dfs(0);
		System.out.println(sb);
	}

	private static void dfs(int depth) {
		if (depth == M) {
			for (int o : output) {
				sb.append(o).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < N; i++) {
			if (visited[i]) continue;
			output[depth] = input[i];
			
			visited[i] = true;
			dfs(depth + 1);
			visited[i] = false;
		}
	}
}