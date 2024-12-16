import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		int k = Integer.parseInt(br.readLine());

		int l = 0, r = 0;
		long answer = 0;
		long sum = 0;

		while (true) {
			if (sum > k) {
				answer += n - r + 1;
				sum -= arr[l++];
				if (l > n) {
					break;
				}
			} else {
				if (r < n) {
					sum += arr[r++];
				} else {
					break;
				}
			}
		}

		System.out.println(answer);
	}
}