import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] arr = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}

		long max = arr[N - 1];

		// 거꾸로 이동하면서 속도를 최소화
		for (int i = N - 2; i >= 0; i--) {
			// 가장 가까운 정수 배로 올리기
			if (max % arr[i] != 0) {
				max = (max + arr[i] - 1) / arr[i] * arr[i];
			}
		}

		System.out.println(max);
	}
}