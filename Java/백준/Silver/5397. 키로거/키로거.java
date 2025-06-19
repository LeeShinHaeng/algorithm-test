import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			Stack<Character> left = new Stack<>();
			Stack<Character> right = new Stack<>();

			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
				switch (c) {
					case '<':
						if (!left.isEmpty())
							right.push(left.pop());
						break;
					case '>':
						if (!right.isEmpty())
							left.push(right.pop());
						break;
					case '-':
						if (!left.isEmpty())
							left.pop();
						break;
					default:
						left.push(c);
				}
			}

			for (char c : left)
				sb.append(c);
			while (!right.isEmpty())
				sb.append(right.pop());
			sb.append('\n');
		}

		System.out.print(sb);
	}
}