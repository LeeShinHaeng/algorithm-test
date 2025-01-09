import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
	static int[][] matrix;
	static Queue<int[]> starts;
	static int[] nX = {-1, 0, 1, 0}, nY = {0, 1, 0, -1};

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		matrix = new int[M][N];
		starts = new LinkedList<>();
		for (int i = 0; i < M; i++) {
			s = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				matrix[i][j] = Integer.parseInt(s[j]);
				if (matrix[i][j] == 1)
					starts.add(new int[]{i, j});
			}
		}

		bfs();

		int result = Integer.MIN_VALUE;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] == 0) {
					System.out.print("-1");
					return;
				}
				result = Math.max(result, matrix[i][j]);
			}
		}
		System.out.println(result - 1);
	}

	private static void bfs() {
		while (!starts.isEmpty()) {
			int[] cur = starts.poll();
			int r = cur[0];
			int c = cur[1];

			for (int i = 0; i < 4; i++) {
				int nx = cur[0] + nX[i];
				int ny = cur[1] + nY[i];
				if (isOkayToMove(nx, ny)) {
					starts.add(new int[]{nx, ny});
					matrix[nx][ny] = matrix[r][c] + 1;
				}
			}
		}
	}

	private static boolean isOkayToMove(int x, int y) {
		if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length) return false;
		return matrix[x][y] == 0;
	}
}