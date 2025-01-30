import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			List<Integer> list = new ArrayList<>();
			int tmp;

			while (true) {
				tmp = Integer.parseInt(br.readLine());
				if (tmp == 0) break;
				list.add(tmp);
			}

			boolean flag = false;
			list.sort(Collections.reverseOrder());
			int result = 0;

			for (int j = 0; j < list.size(); j++) {
				result += (int) (2 * (Math.pow(list.get(j), j + 1)));
				if (result > 5000000) {
					flag = true;
					break;
				}
			}

			if (flag) {
				sb.append("Too expensive\n");
			} else {
				sb.append(result).append("\n");
			}
		}
		System.out.println(sb);
	}
}