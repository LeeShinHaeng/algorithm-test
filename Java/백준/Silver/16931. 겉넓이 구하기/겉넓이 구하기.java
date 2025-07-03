import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int sum = N * M;
		for (int i = 0; i < N; i++) {
			sum += arr[i][0];
			for (int j = 1; j < M; j++) {
				int tmp = arr[i][j] - arr[i][j - 1];
				if (tmp > 0) sum += tmp;
			}
		}

		for (int j = 0; j < M; j++) {
			sum += arr[0][j];
			for (int i = 1; i < N; i++) {
				int tmp = arr[i][j] - arr[i - 1][j];
				if (tmp > 0) sum += tmp;
			}
		}

		System.out.println(sum * 2);
	}
}