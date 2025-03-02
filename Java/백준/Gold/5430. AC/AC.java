import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			// 입력 받기
			String command = br.readLine();
			int n = Integer.parseInt(br.readLine());
			String input = br.readLine();
			input = input.substring(1, input.length() - 1);
			String[] inputs = input.split(",");
			Deque<Integer> deque = new ArrayDeque<>();
			for (int j = 0; j < n; j++) {
				deque.addLast(Integer.parseInt(inputs[j]));
			}

			boolean flag = true; // true = -> / false = <-
			boolean isError = false;
			for (int j = 0; j < command.length(); j++) {
				char c = command.charAt(j);
				if (c == 'R') {
					flag = !flag;
					continue;
				}

				// 비어있는지 검증
				if (deque.isEmpty()) {
					isError = true;
					break;
				}

				if (flag)
					deque.pollFirst();
				else
					deque.pollLast();
			}

			if (isError) {
				sb.append("error").append('\n');
				continue;
			}

			sb.append('[');
			if (!deque.isEmpty()) {
				if (flag) {
					while (!deque.isEmpty())
						sb.append(deque.pollFirst()).append(',');
				} else {
					while (!deque.isEmpty())
						sb.append(deque.pollLast()).append(',');
				}
				sb.deleteCharAt(sb.length() - 1);
			}
			sb.append("]\n");
		}
		System.out.println(sb);
	}
}