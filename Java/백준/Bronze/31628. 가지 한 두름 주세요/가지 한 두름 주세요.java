import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] colors = new String[10][10];
		boolean tmp, result = false;
		for (int i = 0; i < 10; i++) {
			tmp = true;
			String[] input = br.readLine().split(" ");
			colors[i][0] = input[0];
			for (int j = 1; j < 10; j++) {
				colors[i][j] = input[j];
				if (!colors[i][j].equals(colors[i][j - 1]))
					tmp = false;
			}
			// 이번 가로줄이 가능한지
			if (tmp) result = true;
		}
		// 가로로 검사한 결과 중 하나라도 가능하면 return
		if (result) {
			System.out.println(1);
			return;
		}

		// 세로줄 검사
		for (int i = 0; i < 10; i++) {
			result = true;
			for (int j = 0; j < 9; j++) {
				if (!colors[j][i].equals(colors[j + 1][i])) {
					result = false;
					break;
				}
			}

			// 이번 세로줄이 가능한지
			if (result) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}
}