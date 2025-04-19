import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input;
		int[][] triangle = new int[N + 1][N];
		for (int i = 1; i <= N; i++) {
			input = br.readLine().split(" ");
			for (int j = 0; j < input.length; j++) {
				triangle[i][j] = Integer.parseInt(input[j]);
				if (j == 0)
					triangle[i][j] += triangle[i - 1][j];
				else if (j == input.length - 1)
					triangle[i][j] += triangle[i - 1][j - 1];
				else
					triangle[i][j] += Math.max(triangle[i - 1][j - 1], triangle[i - 1][j]);
			}
		}
		int max = triangle[N][0];
		for (int t : triangle[N]) {
			if (max < t) max = t;
		}
		System.out.println(max);
	}
}