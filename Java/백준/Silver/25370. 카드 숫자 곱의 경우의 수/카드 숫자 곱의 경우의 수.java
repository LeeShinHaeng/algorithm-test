import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main {
	static int N;
	static Set<Integer> set;

	public static void main(String[] args) throws Exception {
		set = new HashSet<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		calc(1, 0);
		System.out.println(set.size());
	}

	static void calc(int multi, int depth) {
		if (depth == N) {
			set.add(multi);
			return;
		}
		for (int i = 1; i <= 9; i++) {
			calc(multi * i, depth + 1);
		}
	}
}