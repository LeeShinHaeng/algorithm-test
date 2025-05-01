import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	static Map<Character, char[]> list;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		list = new HashMap<>();
		sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			list.put((char) ('A' + i), new char[2]);
		}

		String[] s;
		for (int i = 0; i < N; i++) {
			s = br.readLine().split(" ");
			char cur = s[0].charAt(0);
			char left = s[1].charAt(0);
			char right = s[2].charAt(0);
			list.get(cur)[0] = left;
			list.get(cur)[1] = right;
		}

		preorder('A');
		sb.append("\n");
		inorder('A');
		sb.append("\n");
		postorder('A');
		System.out.println(sb);
	}

	private static void preorder(char cur) {
		if (cur == '.') return;
		sb.append(cur);
		preorder(list.get(cur)[0]);
		preorder(list.get(cur)[1]);
	}

	private static void inorder(char cur) {
		if (cur == '.') return;
		inorder(list.get(cur)[0]);
		sb.append(cur);
		inorder(list.get(cur)[1]);
	}

	private static void postorder(char cur) {
		if (cur == '.') return;
		postorder(list.get(cur)[0]);
		postorder(list.get(cur)[1]);
		sb.append(cur);
	}
}