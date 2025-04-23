import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	static Map<String, Integer> subjects;
	static Map<String, Integer> fruits;
	static Map<String, Integer> colors;
	static BufferedReader br;

	public static void main(String[] args) throws IOException {
		int[][][] arr = new int[4][4][4];
		initMap();

		br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);

		for (int i = 0; i < N; i++) {
			int[] nums = readInput();
			arr[nums[0]][nums[1]][nums[2]]++;
			arr[3][nums[1]][nums[2]]++;
			arr[nums[0]][3][nums[2]]++;
			arr[nums[0]][nums[1]][3]++;
			arr[nums[0]][3][3]++;
			arr[3][nums[1]][3]++;
			arr[3][3][nums[2]]++;
			arr[3][3][3]++;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			int[] nums = readInput();
			sb.append(arr[nums[0]][nums[1]][nums[2]]).append("\n");
		}
		System.out.println(sb);
	}

	private static void initMap() {
		subjects = new HashMap<>();
		subjects.put("kor", 0);
		subjects.put("eng", 1);
		subjects.put("math", 2);
		subjects.put("-", 3);
		fruits = new HashMap<>();
		fruits.put("apple", 0);
		fruits.put("pear", 1);
		fruits.put("orange", 2);
		fruits.put("-", 3);
		colors = new HashMap<>();
		colors.put("red", 0);
		colors.put("blue", 1);
		colors.put("green", 2);
		colors.put("-", 3);
	}

	public static int[] readInput() throws IOException {
		String[] s = br.readLine().split(" ");
		return new int[]{subjects.get(s[0]), fruits.get(s[1]), colors.get(s[2])};
	}
}