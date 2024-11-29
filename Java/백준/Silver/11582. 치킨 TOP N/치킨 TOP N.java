import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] strArr = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		int k = Integer.parseInt(br.readLine());

		int slice = n / k;
		int[][] sliced = new int[k][slice];

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < slice; j++) {
				sliced[i][j] = arr[i * slice + j];
			}
		}

		for (int[] s : sliced) {
			mergeSort(s, 0, slice - 1, new int[slice]);
		}

		for (int[] s : sliced) {
			for (int i = 0; i < slice; i++) {
				System.out.print(s[i] + " ");
			}
		}
	}

	private static void mergeSort(int[] arr, int low, int high, int[] merged) {
		if (low >= high) return;
		int mid = (low + high) / 2;
		mergeSort(arr, low, mid, merged);
		mergeSort(arr, mid + 1, high, merged);

		int i = low, j = mid + 1;
		for (int k = low; k <= high; k++) {
			if (j > high) {
				merged[k] = arr[i++];
			} else if (i > mid) {
				merged[k] = arr[j++];
			} else if (arr[i] <= arr[j]) {
				merged[k] = arr[i++];
			} else {
				merged[k] = arr[j++];
			}
		}

		for (int k = low; k <= high; k++) {
			arr[k] = merged[k];
		}
	}
}