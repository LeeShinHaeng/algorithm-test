import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String P = br.readLine();
		int index = 0, count = 1;
		for (int i = 0; i < P.length(); i++) {
			if (S.contains(P.substring(index, i + 1)))
				continue;
			index = i;
			count++;
		}
		System.out.println(count);
	}
}