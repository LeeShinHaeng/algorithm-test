import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws Exception {
		int[] goals = new int[5];
		Queue<Integer>[] times = new PriorityQueue[5];
		for (int i = 0; i < 5; i++) {
			times[i] = new PriorityQueue<>();
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < 5; i++) {
			goals[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int level = Integer.parseInt(st.nextToken());
			int time = Integer.parseInt(st.nextToken());
			times[level - 1].add(time);
		}

		int sum = 0;       // 총합
		int before = 0;    // 이전에 넣은 시간

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < goals[i]; j++) {
				if (i != 0 && j == 0)
					sum += 60;
				int cur = times[i].poll();
				sum += cur;
				if (j != 0)
					sum += cur - before;
				before = cur;
			}
		}
		System.out.println(sum);
	}
}