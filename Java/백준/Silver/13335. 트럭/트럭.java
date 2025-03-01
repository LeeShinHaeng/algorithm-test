import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int w = Integer.parseInt(input[1]);
		int L = Integer.parseInt(input[2]);

		int[] trucks = new int[n];
		input = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			trucks[i] = Integer.parseInt(input[i]);
		}

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < w; i++)
			queue.add(0);

		int time = 0;
		int index = 0;
		int sum = 0;

		while (index < n) {
			time++;

			int removed = queue.poll();
			sum -= removed;

			if (sum + trucks[index] <= L) {
				queue.add(trucks[index]);
				sum += trucks[index];
				index++;
			} else {
				queue.add(0);
			}
		}

		while (!queue.isEmpty()) {
			time++;
			queue.poll();
		}

		System.out.println(time);
	}
}