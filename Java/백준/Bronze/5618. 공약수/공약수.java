import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		String[] strs = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}
		ArrayList<Integer> answer;
		if (n == 3) {
			int tmp = gcd(nums[0], nums[1]);
			answer = find2(nums[2], tmp);
		} else {
			answer = find2(nums[0], nums[1]);
		}

		for (int a : answer) {
			System.out.println(a);
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}

	public static ArrayList<Integer> find2(int a, int b) {
		int tmp = gcd(a, b);
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 1; i <= tmp; i++) {
			if (tmp % i == 0) {
				answer.add(i);
			}
		}
		return answer;
	}
}