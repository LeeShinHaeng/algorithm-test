import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			String[] input = br.readLine().split(" ");
			if (input[0].equals("0")) break;

			long value = 1;
			int n = Integer.parseInt(input[0]);
			for (int i = 1; i <= n; i++) {
				value *= Integer.parseInt(input[2 * i - 1]);
				value -= Integer.parseInt(input[2 * i]);
			}
			sb.append(value).append("\n");
		}
		System.out.println(sb.deleteCharAt(sb.length() - 1));
	}
}
