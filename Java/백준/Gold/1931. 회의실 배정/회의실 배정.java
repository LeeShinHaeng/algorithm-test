import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] time = new int[N][2];
		for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split(" ");
			time[i][0] = Integer.parseInt(s[0]);
			time[i][1] = Integer.parseInt(s[1]);
		}

		// 끝나는 시간이 빠른 순으로 정렬
		Arrays.sort(time, (o1, o2) -> {
			if(o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}
			return o1[1] -  o2[1];
		});

		int count = 0;
		int lastEndTime = 0;

		// 시작 끝나는 시간이 직전 끝 시간 이후면 배정
		for(int[] t: time) {
			if(lastEndTime <= t[0]) {
				lastEndTime = t[1];
				count++;
			}
		}

		System.out.println(count);
	}
}