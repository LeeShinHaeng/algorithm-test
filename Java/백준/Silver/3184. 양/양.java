import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static char[][] arr;
	static boolean[][] visited;
	static int N, M, sheep = 0, wolves = 0, totalSheep = 0, totalWolves = 0;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new char[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = line.charAt(j);
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				dfs(i, j);

				if (sheep <= wolves) totalWolves += wolves;
				else totalSheep += sheep;

				sheep = 0;
				wolves = 0;
			}
		}

		System.out.println(totalSheep + " " + totalWolves);
	}

	private static void dfs(int x, int y) {
		if (visited[x][y] || arr[x][y] == '#') return;
		visited[x][y] = true;

		if (arr[x][y] == 'o') sheep++;
		else if (arr[x][y] == 'v') wolves++;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

			dfs(nx, ny);
		}
	}
}