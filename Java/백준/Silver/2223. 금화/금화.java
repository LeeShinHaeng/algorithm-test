import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int t = Integer.parseInt(input[0]);
		int x = Integer.parseInt(input[1]);
		int m = Integer.parseInt(input[2]);

		// 모든 몬스터에 대해 safe coin picks = (d - 1) / s 의 최솟값을 구함
		int speed = Integer.MAX_VALUE;
		for (int i = 0; i < m; i++) {
			input = br.readLine().split(" ");
			int d = Integer.parseInt(input[0]);
			int s = Integer.parseInt(input[1]);
			int safe = (d - 1) / s;
			speed = Math.min(speed, safe);
		}

		long answer;
		if (speed == 0) {
			answer = 0;
		} else if (t > speed) {
			answer = (speed + (t - speed) / 2) * (long) x;
		} else {
			answer = t * (long) x;
		}

		System.out.println(answer);
	}
}