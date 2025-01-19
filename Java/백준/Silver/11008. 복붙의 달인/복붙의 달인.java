import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			String[] input = br.readLine().split(" ");
			String s = input[0];
			String p = input[1];

			int count = 0;

			while (s.contains(p)) {
				count++;
				s = s.replaceFirst(p, "");
			}
			count += s.length();
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}