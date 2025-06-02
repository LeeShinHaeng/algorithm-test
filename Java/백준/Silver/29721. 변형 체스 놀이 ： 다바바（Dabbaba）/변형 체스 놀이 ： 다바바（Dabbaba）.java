import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[][] location = new int[K][2];
		Set<Long> visit = new HashSet<>();

		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()) - 1;
			int y = Integer.parseInt(st.nextToken()) - 1;
			location[i][0] = x;
			location[i][1] = y;
			visit.add((long) x * N + y);
		}

		int[] dx = {-2, 2, 0, 0};
		int[] dy = {0, 0, -2, 2};

		int count = 0;
		for (int[] loc : location) {
			int x = loc[0];
			int y = loc[1];
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if (nx < 0 || nx >= N || ny < 0 || ny >= N) continue;

				long key = (long) nx * N + ny;
				if (visit.contains(key)) continue;

				count++;
				visit.add(key);
			}
		}
		System.out.println(count);
	}
}