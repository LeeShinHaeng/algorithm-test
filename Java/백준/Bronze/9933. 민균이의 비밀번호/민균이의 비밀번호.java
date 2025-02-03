import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	static HashMap<String, String> reverse = new HashMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			if (reverse.containsKey(s)) {
				System.out.println(reverse.get(s));
				return;
			}
			if (isPalindrome(s)) {
				System.out.println(s.length() + " " + s.charAt(s.length() / 2));
				return;
			}
			reverse.put(reversing(s), s.length() + " " + s.charAt(s.length() / 2));
		}
	}

	private static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	private static String reversing(String s) {
		StringBuilder res = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			res.append(s.charAt(i));
		}
		return res.toString();
	}
}