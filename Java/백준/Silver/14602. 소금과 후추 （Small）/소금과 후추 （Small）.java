import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	static int M;
	static int N;
	static int K;
	static int W;
	static int[][] matrix;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		M = Integer.parseInt(input[0]);
		N = Integer.parseInt(input[1]);
		K = Integer.parseInt(input[2]);
		W = Integer.parseInt(input[3]);
		matrix = new int[M][N];
		for (int i = 0; i < M; i++) {
			input = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				matrix[i][j] = Integer.parseInt(input[j]);
			}
		}

		int[][] output = new int[M - W + 1][N - W + 1];
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j < output[0].length; j++) {
				System.out.print(findMedian(i, j) + " ");
			}
			System.out.println();
		}
	}

	private static int findMedian(int a, int b) {
		int[] tmp = new int[W * W];
		int index = 0;
		for (int i = a; i < a + W; i++) {
			for (int j = b; j < b + W; j++) {
				tmp[index++] = matrix[i][j];
			}
		}
		Arrays.sort(tmp);
		return tmp[tmp.length / 2];
	}
}