import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int count = 1;
		while (true) {
			int N = Integer.parseInt(br.readLine());
			if (N == 0) break;

			long[][] arr = new long[N][3];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 3; j++)
					arr[i][j] = Long.parseLong(st.nextToken());
			}

			arr[0][2] += arr[0][1];
			arr[1][0] += arr[0][1];
			arr[1][1] += Math.min(Math.min(arr[1][0], arr[0][1]), arr[0][2]);
			arr[1][2] += Math.min(Math.min(arr[1][1], arr[0][1]), arr[0][2]);

			for (int i = 2; i < N; i++) {
				arr[i][0] += Math.min(arr[i - 1][0], arr[i - 1][1]);
				arr[i][1] += Math.min(Math.min(Math.min(arr[i][0], arr[i - 1][0]), arr[i - 1][1]), arr[i - 1][2]);
				arr[i][2] += Math.min(Math.min(arr[i][1], arr[i - 1][1]), arr[i - 1][2]);
			}

			sb.append(count).append(". ").append(arr[N - 1][1]).append('\n');
			count++;
		}

		System.out.print(sb);
	}
}