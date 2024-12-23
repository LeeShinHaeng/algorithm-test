import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			if (sb.length() == 0) {
				sb.append(input);
				continue;
			}
			String current = sb.toString();
			sb.setLength(0);
			for (int j = 0; j < input.length(); j++) {
				char currentChar = current.charAt(j);
				if (currentChar == '?') {
					sb.append(currentChar);
					continue;
				}

				char inputChar = input.charAt(j);
				if (inputChar != currentChar)
					sb.append('?');
				else
					sb.append(inputChar);
			}
		}

		System.out.println(sb);
	}
}