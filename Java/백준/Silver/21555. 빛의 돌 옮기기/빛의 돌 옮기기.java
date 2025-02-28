import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);
		int[] A = new int[N];
		int[] B = new int[N];
		input = br.readLine().split(" ");
		for (int i = 0; i < N; i++)
			A[i] = Integer.parseInt(input[i]);
		input = br.readLine().split(" ");
		for (int i = 0; i < N; i++)
			B[i] = Integer.parseInt(input[i]);

		long[] dp0 = new long[N];
		long[] dp1 = new long[N];
		dp0[0] = A[0];
		dp1[0] = B[0];

		for (int i = 1; i < N; i++) {
			dp0[i] = Math.min(dp0[i - 1] + A[i], dp1[i - 1] + K + A[i]);
			dp1[i] = Math.min(dp1[i - 1] + B[i], dp0[i - 1] + K + B[i]);
		}

		System.out.println(Math.min(dp0[N - 1], dp1[N - 1]));
	}
}