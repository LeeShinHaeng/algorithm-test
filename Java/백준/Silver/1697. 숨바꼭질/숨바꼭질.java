import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		if (N == K) {
			System.out.println(0);
			return;
		}

		int max = Math.max(N, K) * 2;
		int[] depth = new int[max + 1];
		Arrays.fill(depth, -1);

		Queue<Integer> queue = new LinkedList<>();
		queue.offer(N);
		depth[N] = 0;

		while (!queue.isEmpty()) {
			int cur = queue.poll();

			int[] next = {cur - 1, cur + 1, cur * 2};
			for (int n : next) {
				if (n >= 0 && n <= max && depth[n] == -1) {
					depth[n] = depth[cur] + 1;
					queue.offer(n);
					if (n == K) {
						System.out.println(depth[n]);
						return;
					}
				}
			}
		}
	}
}