import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			int len = s.length;
			int[] arr = new int[len];
			for (int j = 0; j < len; j++) {
				arr[j] = Integer.parseInt(s[j]);
			}
			int max = 0;
			for (int j = 0; j < len; j++) {
				for (int k = j + 1; k < len; k++) {
					max = Math.max(max, gcd(arr[j], arr[k]));
				}
			}
			sb.append(max).append("\n");
		}
		System.out.println(sb);
	}

	private static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
}