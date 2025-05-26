import java.io.*;
import java.util.*;

public class Main {
	static int L, R, C;
	static boolean[][][] cube, visited;
	static int[] dx = {1, -1, 0, 0, 0, 0};
	static int[] dy = {0, 0, 1, -1, 0, 0};
	static int[] dz = {0, 0, 0, 0, 1, -1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			L = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			if (L == 0 && R == 0 && C == 0) break;

			cube = new boolean[L][R][C];
			int sx = 0, sy = 0, sz = 0, ex = 0, ey = 0, ez = 0;
			for (int i = 0; i < L; i++) {
				for (int j = 0; j < R; j++) {
					String line = br.readLine();
					for (int k = 0; k < C; k++) {
						char ch = line.charAt(k);
						cube[i][j][k] = (ch != '#');
						if (ch == 'S') {
							sx = i;
							sy = j;
							sz = k;
						}
						if (ch == 'E') {
							ex = i;
							ey = j;
							ez = k;
						}
					}
				}
				br.readLine();
			}

			int d = findPath(sx, sy, sz, ex, ey, ez);
			if (d < 0) sb.append("Trapped!\n");
			else sb.append("Escaped in ").append(d).append(" minute(s).\n");
		}
		System.out.print(sb);
	}

	public static int findPath(int sx, int sy, int sz, int ex, int ey, int ez) {
		Queue<Point> q = new LinkedList<>();
		visited = new boolean[L][R][C];
		q.offer(new Point(sx, sy, sz, 0));
		visited[sx][sy][sz] = true;

		while (!q.isEmpty()) {
			Point p = q.poll();
			if (p.x == ex && p.y == ey && p.z == ez)
				return p.dist;

			for (int i = 0; i < 6; i++) {
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				int nz = p.z + dz[i];
				if (nx < 0 || nx >= L || ny < 0 || ny >= R || nz < 0 || nz >= C) continue;
				if (visited[nx][ny][nz] || !cube[nx][ny][nz]) continue;
				visited[nx][ny][nz] = true;
				q.offer(new Point(nx, ny, nz, p.dist + 1));
			}
		}
		return -1;
	}
}

class Point {
	int x, y, z, dist;

	Point(int x, int y, int z, int d) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.dist = d;
	}
}