import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N + 1];
		Arrays.fill(arr, Integer.MAX_VALUE);
		List<Integer>[] port = new ArrayList[N + 1];
		for (int i = 0; i < N + 1; i++)
			port[i] = new ArrayList<>();

		st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			port[A].add(B);
			port[B].add(A);
		}

		boolean[] visited = new boolean[N + 1];
		Queue<Integer> q = new ArrayDeque<>();
		arr[S] = 0;
		q.offer(S);
		while (!q.isEmpty()) {
			int cur = q.poll();
			List<Integer> ports = port[cur];
			for (Integer p : ports) {
				if (visited[p]) continue;
				arr[p] = arr[cur] + 1;
				visited[p] = true;
				q.offer(p);
			}
			int n1 = cur - 1, n2 = cur + 1;
			if (n1 >= 0 && !visited[n1]) {
				visited[n1] = true;
				arr[n1] = arr[cur] + 1;
				q.offer(n1);
			}
			if (n2 <= N && !visited[n2]) {
				visited[n2] = true;
				arr[n2] = arr[cur] + 1;
				q.offer(n2);
			}
		}

		System.out.println(arr[E]);
	}
}