import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int n;
	static int[] arr;
	static int[] ops = new int[4];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		String[] s = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		s = br.readLine().split(" ");

		for (int i = 0; i < 4; i++) {
			ops[i] = Integer.parseInt(s[i]);
		}

		dfs(0, arr[0]);

		System.out.println(max);
		System.out.println(min);
	}

	public static void dfs(int depth, int cur) {
		if (depth == n - 1) {
			max = Math.max(max, cur);
			min = Math.min(min, cur);
			return;
		}

		if (ops[0] != 0) {
			ops[0]--;
			dfs(depth + 1, cur + arr[depth + 1]);
			ops[0]++;
		}
		if (ops[1] != 0) {
			ops[1]--;
			dfs(depth + 1, cur - arr[depth + 1]);
			ops[1]++;
		}
		if (ops[2] != 0) {
			ops[2]--;
			dfs(depth + 1, cur * arr[depth + 1]);
			ops[2]++;
		}
		if (ops[3] != 0) {
			ops[3]--;
			dfs(depth + 1, (int) (cur / arr[depth + 1]));
			ops[3]++;
		}
	}
}