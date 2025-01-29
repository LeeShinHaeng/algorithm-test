import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		solution2();
	}

	// 작은 것의 개수 = 작은 등수
	public static void solution2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		String[] input = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(input[i]);
		}

		// 정렬된 배열을 똑같이 복사
		int[] sorted = nums.clone();
		Arrays.sort(sorted);

		// 작은 등수를 저장
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int s : sorted) {
			// 이미 있으면 넘어감
			if (map.containsKey(s))
				continue;
			map.put(s, count++);
		}

		// 원래 순서에 맞춰 출력
		StringBuilder sb = new StringBuilder();
		for (int cur : nums) {
			sb.append(map.get(cur)).append(" ");
		}

		System.out.println(sb.toString().trim());
	}
}