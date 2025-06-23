import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		Set<String> set = new HashSet<>();
		set.add(Arrays.toString(new int[]{0, 1, 2, 3}));
		set.add(Arrays.toString(new int[]{0, 2, 4, 6}));
		set.add(Arrays.toString(new int[]{2, 3, 6, 7}));
		set.add(Arrays.toString(new int[]{1, 3, 5, 7}));
		set.add(Arrays.toString(new int[]{0, 1, 4, 5}));
		set.add(Arrays.toString(new int[]{4, 5, 6, 7}));

		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] input = new int[4];
			input[0] = Integer.parseInt(st.nextToken());
			input[1] = Integer.parseInt(st.nextToken());
			input[2] = Integer.parseInt(st.nextToken());
			input[3] = Integer.parseInt(st.nextToken());
			Arrays.sort(input);

			if(set.contains(Arrays.toString(input)))
				sb.append("YES\n");
			else
				sb.append("NO\n");
		}
		System.out.println(sb);
	}
}