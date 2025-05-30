import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < 3; i++) {
			int input = Integer.parseInt(br.readLine());
			String s = appendZero(new StringBuilder(Integer.toBinaryString(input)));
			result.append(s.substring(s.length() - 4));
		}

		String s = String.valueOf(Integer.parseInt(result.toString(), 2));
		System.out.println(appendZero(new StringBuilder(s)));
	}

	private static String appendZero(StringBuilder sb) {
		while (sb.length() < 4)
			sb.insert(0, "0");

		return sb.toString();
	}
}