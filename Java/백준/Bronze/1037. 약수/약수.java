import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int tmp =  Integer.parseInt(input[i]);
			max = Math.max(tmp, max);
			min = Math.min(tmp, min);
		}
		System.out.println(max * min);
	}
}