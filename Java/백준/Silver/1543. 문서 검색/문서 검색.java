import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String key = br.readLine();
		int len = key.length();

		int count = 0;
		while (s.contains(key)) {
			int i = s.indexOf(key);
			s = s.substring(0, i) + " " + s.substring(i + len);
			count++;
		}
		System.out.println(count);
	}
}