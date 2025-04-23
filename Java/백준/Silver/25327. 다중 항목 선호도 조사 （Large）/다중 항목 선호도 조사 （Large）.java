import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		int[][][] arr = new int[4][4][4];
		Map<String, Integer> subjects = new HashMap<>();
		subjects.put("kor", 0);
		subjects.put("eng", 1);
		subjects.put("math", 2);
		subjects.put("-", 3);
		Map<String, Integer> fruits = new HashMap<>();
		fruits.put("apple", 0);
		fruits.put("pear", 1);
		fruits.put("orange", 2);
		fruits.put("-", 3);
		Map<String, Integer> colors = new HashMap<>();
		colors.put("red", 0);
		colors.put("blue", 1);
		colors.put("green", 2);
		colors.put("-", 3);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int N = Integer.parseInt(s[0]);
		int M = Integer.parseInt(s[1]);
		for (int i = 0; i < N; i++) {
			s = br.readLine().split(" ");
			String tmpSubject = s[0];
			String tmpFruit = s[1];
			String tmpColor = s[2];
			int a = subjects.get(tmpSubject);
			int b = fruits.get(tmpFruit);
			int c = colors.get(tmpColor);
			arr[a][b][c]++;
			arr[3][b][c]++;
			arr[a][3][c]++;
			arr[a][b][3]++;
			arr[a][3][3]++;
			arr[3][b][3]++;
			arr[3][3][c]++;
			arr[3][3][3]++;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			s = br.readLine().split(" ");
			String tmpSubject = s[0];
			String tmpFruit = s[1];
			String tmpColor = s[2];
			int a = subjects.get(tmpSubject);
			int b = fruits.get(tmpFruit);
			int c = colors.get(tmpColor);
			sb.append(arr[a][b][c]).append("\n");
		}
		System.out.println(sb);
	}
}