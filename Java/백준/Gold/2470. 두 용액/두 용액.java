import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			nums[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(nums);

		int diff = Integer.MAX_VALUE;
		int indexL = 0, indexR = N - 1, valueL = 0, valueR = 0;
		while (indexL < indexR) {
			int tmp = nums[indexL] + nums[indexR];

			if (Math.abs(tmp) < diff) {
				diff = Math.abs(tmp);
				valueL = nums[indexL];
				valueR = nums[indexR];
				if (tmp == 0) break;
			}

			if (tmp > 0) indexR--;
			else indexL++;
		}
		System.out.println(valueL + " " + valueR);
	}
}