import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<int[]> stack = new ArrayDeque<>();
		long sum = 0;
		String[] input;
		for (int i = 0; i < N; i++) {
			input = br.readLine().split(" ");
			int command = Integer.parseInt(input[0]);
			if (command == 0) {
				if (stack.isEmpty()) continue;
				stack.peek()[1]--;
				if (stack.peek()[1] == 0) {
					sum += stack.pop()[0];
				}
			} else {
				int score = Integer.parseInt(input[1]);
				int time = Integer.parseInt(input[2]) - 1;

				if (time == 0) {
					sum += score;
					continue;
				}

				stack.push(new int[]{score, time});
			}
		}
		System.out.println(sum);
	}
}