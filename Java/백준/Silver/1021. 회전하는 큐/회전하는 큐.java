import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		input = br.readLine().split(" ");
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < N; i++)
			list.add(i + 1);

		int answer = 0;
		for (int i = 0; i < M; i++) {
			int size = list.size();
			int targetIdx = list.indexOf(Integer.parseInt(input[i]));
			int half = size % 2 == 0 ? size / 2 - 1 : size / 2;
			if (targetIdx <= half) {
				for (int j = 0; j < targetIdx; j++)
					list.addLast(list.removeFirst());
				list.removeFirst();
				answer += targetIdx;
				continue;
			}
			for (int j = 0; j < size - targetIdx; j++)
				list.addFirst(list.removeLast());
			list.removeFirst();
			answer += size - targetIdx;
		}

		System.out.println(answer);
	}
}