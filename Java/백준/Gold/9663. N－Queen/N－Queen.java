import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	// arr의 index를 행, 값을 열
	static int[] arr;
	static int N, count = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		nQueens(0);
		System.out.println(count);
	}

	private static void nQueens(int depth) {
		if (depth == N) {
			count++;
			return;
		}

		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			if (isSafe(depth)) {
				nQueens(depth + 1);
			}
		}
	}

	private static boolean isSafe(int depth) {
		for (int i = 0; i < depth; i++) {
			if (arr[i] == arr[depth] ||
				Math.abs(arr[depth] - arr[i]) == Math.abs(depth - i)) {
				return false;
			}
		}
		return true;
	}
}