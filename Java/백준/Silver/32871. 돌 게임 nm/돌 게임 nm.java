import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			long n = Long.parseLong(input[0]);
			long m = Long.parseLong(input[1]);

			// n이나 m중 하나가 1인 경우
			if (n == 1 || m == 1) {
				sb.append("YES").append("\n");
				continue;
			}

			// n+m이 짝수인 경우
			if ((n + m) % 2 == 0)
				sb.append("NO").append("\n");
			else
				sb.append("YES").append("\n");
		}
		System.out.println(sb);
	}
}