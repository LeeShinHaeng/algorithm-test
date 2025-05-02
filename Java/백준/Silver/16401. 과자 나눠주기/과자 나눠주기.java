import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int M, N;
	static int[] snacks;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		snacks = new int[N];
		st = new StringTokenizer(br.readLine());
		int maxSnack = 0;
		for (int i = 0; i < N; i++) {
			snacks[i] = Integer.parseInt(st.nextToken());
			maxSnack = Math.max(maxSnack, snacks[i]);
		}

		System.out.println(binarySearch(maxSnack));
	}

	private static int binarySearch(int maxSnack) {
		int left = 1, right = maxSnack;
		int result = 0;

		while (left <= right) {
			int mid = (left + right) / 2;
			int count = getCountOfSnackBiggerThanLength(mid);

			// 중간 길이보다 많은 조카에게 줄 수 있으면 늘려서 시도
			// 중간 길이만큼 많은 조카에게 줄 수 없으면 줄여서 시도
			if (count >= M) {
				result = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return result;
	}

	private static int getCountOfSnackBiggerThanLength(int length) {
		int count = 0;
		for (int snack : snacks)
			count += snack / length;
		return count;
	}
}