import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < T; i++) {
			// 입력
			int N = Integer.parseInt(br.readLine());
			int[][] score = new int[2][N];
			String[] s = br.readLine().split(" ");
			for (int j = 0; j < N; j++) score[0][j] = Integer.parseInt(s[j]);
			s = br.readLine().split(" ");
			for (int j = 0; j < N; j++) score[1][j] = Integer.parseInt(s[j]);

			// 1이면 바로 반환
			if (N <= 1) {
				sb.append(Math.max(score[0][0], score[1][0])).append("\n");
				continue;
			}

			int[] top = new int[N];
			int[] bottom = new int[N];
			top[0] = score[0][0];
			bottom[0] = score[1][0];

			top[1] = bottom[0] + score[0][1];
			bottom[1] = top[0] + score[1][1];

			// 바로 왼쪽을 (취한 경우) or (건너 뛴 경우) 비교
			for (int j = 2; j < N; j++) {
				top[j] = Math.max(bottom[j - 1], bottom[j - 2]) + score[0][j];
				bottom[j] = Math.max(top[j - 1], top[j - 2]) + score[1][j];
			}

			sb.append(Math.max(top[N - 1], bottom[N - 1])).append("\n");
		}
		System.out.println(sb);
	}
}