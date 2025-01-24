import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int R = Integer.parseInt(input[0]);
		int C = Integer.parseInt(input[1]);
		int[][] matrix = new int[R][C];

		int[] row = new int[R];
		int[] col = new int[C];

		for (int i = 0; i < R; i++) {
			input = br.readLine().split(" ");
			for (int j = 0; j < C; j++) {
				String cur = input[j];
				int tmp = 0;
				for (int k = 0; k < cur.length(); k++) {
					if (cur.charAt(k) == '9') {
						tmp++;
					}
				}
				matrix[i][j] = tmp;
				row[i] += tmp;
				col[j] += tmp;
			}
		}

		int max = 0;
		int index = 0;
		for (int i = 0; i < R; i++) {
			if (max < row[i]) {
				max = row[i];
				index = i;
			}
		}
		boolean flag = false;
		for (int i = 0; i < C; i++) {
			if (max < col[i]) {
				max = col[i];
				index = i;
				flag = true;
			}
		}

		if (flag) {
			for (int i = 0; i < R; i++) {
				matrix[i][index] = 0;
			}
		} else {
			for (int i = 0; i < C; i++) {
				matrix[index][i] = 0;
			}
		}

		int output = 0;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				output += matrix[i][j];
			}
		}
		System.out.print(output);
	}
}