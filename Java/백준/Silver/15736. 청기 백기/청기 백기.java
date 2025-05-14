import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
//		boolean[] flags = new boolean[N + 1];
//		for (int i = 1; i <= N; i++) {
//			for (int j = i; j <= N; j += i) {
//				flags[j] = !flags[j];
//			}
//		}
//		int count = 0;
//		for (int i = 1; i <= N; i++) {
//			if (flags[i]) {
//				count++;
//			}
//		}
//		System.out.println(count);
		System.out.print((int) Math.sqrt(N));
	}
}