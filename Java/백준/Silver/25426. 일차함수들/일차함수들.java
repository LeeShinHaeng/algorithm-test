import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<int[]> pairs = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			pairs.add(new int[]{a, b});
		}

		pairs.sort((a, b) -> {
			return a[0] - b[0];
		});

		long sum = 0;
		for (int i = 1; i <= N; i++) {
			int[] pair = pairs.get(i - 1);
			sum += (long) pair[0] * i + pair[1];
		}
		System.out.println(sum);
	}
}