import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		char[] koreaChars = {'K', 'O', 'R', 'E', 'A'};
		char[] yonseiChars = {'Y', 'O', 'N', 'S', 'E', 'I'};

		int koreaIdx = 0, yonseiIdx = 0;

		StringBuilder korea = new StringBuilder();
		StringBuilder yonsei = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == koreaChars[koreaIdx]) {
				korea.append(c);
				koreaIdx++;
			}
			if (c == yonseiChars[yonseiIdx]) {
				yonsei.append(c);
				yonseiIdx++;
			}
			if (koreaIdx == koreaChars.length) {
				System.out.println("KOREA");
				return;
			} else if (yonseiIdx == yonseiChars.length) {
				System.out.println("YONSEI");
				return;
			}
		}
	}
}