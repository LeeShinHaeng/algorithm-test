import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		StringBuilder sb = new StringBuilder();

		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			// 인덱스, 우선순위
			Deque<int[]> queue = new ArrayDeque<>();
			PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

			st = new StringTokenizer(br.readLine());
			for (int idx = 0; idx < N; idx++) {
				int priority = Integer.parseInt(st.nextToken());
				queue.add(new int[]{idx, priority});
				maxHeap.add(priority);
			}

			int count = 0;
			while (!queue.isEmpty()) {
				// 현재 맨앞의 인덱스와 우선순위
				int[] front = queue.poll();

				// 현재 우선순위가 최대값이면
				if (front[1] == maxHeap.peek()) {
					count++;
					// 현재 인덱스가 M이면 종료
					if (front[0] == M) break;
					maxHeap.poll();
					continue;
				}
				queue.add(front);
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}