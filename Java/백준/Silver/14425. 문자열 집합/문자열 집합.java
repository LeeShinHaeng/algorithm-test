import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		Set<String> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			set.add(s);
		}
		int count = 0;
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			if (set.contains(s)) {
				count++;
			}
		}
		System.out.println(count);
	}
}