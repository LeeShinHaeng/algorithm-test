import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int N = Integer.parseInt(input[2]);

		int result = 0;
		for (int i = 0; i < N; i++) {
			A = (A % B) * 10;
			result = A / B;
		}
		System.out.println(result);
	}
}