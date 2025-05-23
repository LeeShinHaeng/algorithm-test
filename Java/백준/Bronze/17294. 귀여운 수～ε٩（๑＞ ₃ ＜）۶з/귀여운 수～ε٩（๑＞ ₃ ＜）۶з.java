import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		if (s.length() <= 1) {
			System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
			return;
		}

		int a = s.charAt(0) - '0';
		int b = s.charAt(1) - '0';
		int k = a - b;

		for (int i = 1; i < s.length() - 1; i++) {
			a = s.charAt(i) - '0';
			b = s.charAt(i + 1) - '0';
			if (a - b == k) continue;

			System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
			return;
		}
		System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
	}
}