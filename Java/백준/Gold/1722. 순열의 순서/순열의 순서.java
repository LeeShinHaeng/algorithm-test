import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	static int N;
	static boolean[] visited = new boolean[21];
	static long[] factorials;

	public static void main(String[] args) throws Exception {
		factorials = new long[21];
		factorials[0] = 1;
		for (int i = 1; i <= 20; i++)
			factorials[i] = i * factorials[i - 1];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int mode = Integer.parseInt(st.nextToken());
		switch (mode) {
			case 1:
				long K = Long.parseLong(st.nextToken());
				System.out.println(findSequence(K));
				return;
			case 2:
				int[] arr = new int[N];
				for (int i = 0; i < N; i++)
					arr[i] = Integer.parseInt(st.nextToken());
				System.out.println(findOrder(arr));
		}
	}

	private static String findSequence(long k) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= N; j++) {
				if (visited[j]) continue;
				if (k - factorials[N - 1 - i] > 0) {
					k -= factorials[N - 1 - i];
				} else {
					sb.append(j).append(" ");
					visited[j] = true;
					break;
				}
			}
		}
		return sb.toString();
	}

	private static long findOrder(int[] arr) {
		long ans = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 1; j < arr[i]; j++) {
				if (!visited[j]) {
					ans += factorials[N - 1 - i];
				}

			}
			visited[arr[i]] = true;
		}
		return ans;
	}
}