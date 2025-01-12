import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int count = 0;
		for (String s : strs) {
			if (s.charAt(0) != '-' && s.charAt(0) != '0')
				count++;
		}
		System.out.println(count);
	}
}