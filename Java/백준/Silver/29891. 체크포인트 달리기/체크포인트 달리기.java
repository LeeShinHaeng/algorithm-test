import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);

		int[] points = new int[n];
		for (int i = 0; i < n; i++) {
			points[i] = Integer.parseInt(br.readLine());
		}

		List<Integer> positive = new ArrayList<>();
		List<Integer> negative = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (points[i] > 0) {
				positive.add(points[i]);
			} else if (points[i] < 0) {
				negative.add(points[i] * -1);
			}
		}

		Collections.sort(positive, Collections.reverseOrder());
		Collections.sort(negative, Collections.reverseOrder());

		long sum = 0;
		for (int i = 0; i < positive.size(); i += k) {
			sum += positive.get(i);
		}
		for (int i = 0; i < negative.size(); i += k) {
			sum += negative.get(i);
		}

		System.out.println(sum * 2);
	}
}