import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int min = Integer.parseInt(input[1]);
		int max = Integer.parseInt(input[2]);
		int up = Integer.parseInt(input[3]);
		int down = Integer.parseInt(input[4]);
		int now = min;

		if (max - min < up) {
			System.out.println(-1);
			return;
		}
		
		int total = 0;
		int ing = 0;
		while (ing < N) {
			total++;
			int next = up + now;
			// 운동 가능
			if (next <= max) {
				ing++;
				now = next;
				continue;
			}
			// 운동 불가능
			now -= down;
			if (now < min) now = min;
		}
		System.out.println(total);
	}
}