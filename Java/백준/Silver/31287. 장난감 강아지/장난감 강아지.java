import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		String s = br.readLine();

		int round = 0, inning = 1;
		int x = 0, y = 0;
		
		// 최소한 절반은 되돌아 오는데 써야함, 그렇지 않으면 무수히 멀어짐
		if (K > (N / 2)) 
			K = N / 2;

		for (int i = 0; i < N; i++) {
			char c = s.charAt(i);
			switch (c) {
				case 'U': {
					y++;
					break;
				}
				case 'D': {
					y--;
					break;
				}
				case 'L': {
					x--;
					break;
				}
				case 'R': {
					x++;
					break;
				}
			}
			if (x == 0 && y == 0) {
				System.out.println("YES");
				return;
			}
			if (round++ == N - 1 && inning < K) {
				round = 0;
				inning++;
				i = -1;
			}
		}
		System.out.println("NO");
	}
}