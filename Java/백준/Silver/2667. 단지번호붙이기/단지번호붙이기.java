import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	static boolean[][] input;
	static boolean[][] visited;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		input = new boolean[N][N];
		visited = new boolean[N][N];
		String[] s;
		for (int i = 0; i < N; i++) {
			s = br.readLine().split("");
			for (int j = 0; j < N; j++) {
				if (Integer.parseInt(s[j]) == 1) input[i][j] = true;
			}
		}
		List<Integer> counts = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (input[i][j] && !visited[i][j])
					counts.add(dfs(i, j));
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(counts.size()).append("\n");
		Collections.sort(counts);
		for (Integer c : counts)
			sb.append(c).append("\n");

		System.out.println(sb);
	}

	private static int dfs(int x, int y) {
		visited[x][y] = true;
		int count = 1;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx < N && ny >= 0 && ny < N
				&& input[nx][ny] && !visited[nx][ny])
				count += dfs(nx, ny);
		}
		return count;
	}
}