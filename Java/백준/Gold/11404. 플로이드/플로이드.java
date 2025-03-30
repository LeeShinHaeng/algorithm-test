import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int[][] map;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		map = new int[N][N];

		// 모든 연결을 MAX로 초기화 (자기자신은 0)
		for (int i = 0; i < N; i++) {
			Arrays.fill(map[i], Integer.MAX_VALUE);
			map[i][i] = 0;
		}

		// 입력
		for (int i = 0; i < m; i++) {
			String[] input = br.readLine().split(" ");
			int start = Integer.parseInt(input[0]) - 1;
			int end = Integer.parseInt(input[1]) - 1;
			int value = Integer.parseInt(input[2]);
			map[start][end] = Math.min(map[start][end], value);
		}

		floyd();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == Integer.MAX_VALUE) map[i][j] = 0;
				sb.append(map[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	private static void floyd() {
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					// (i -> j) > (i -> k -> j) 인 경우 갱신
					if (map[i][k] != Integer.MAX_VALUE &&
						map[k][j] != Integer.MAX_VALUE &&
						map[i][k] + map[k][j] < map[i][j]) {
						map[i][j] = map[i][k] + map[k][j];
					}
				}
			}
		}
	}
}