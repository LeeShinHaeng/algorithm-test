import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int R = Integer.parseInt(input[0]);
		int C = Integer.parseInt(input[1]);
		int[] rank = new int[9];
		for (int i = 0; i < R; i++) {
			String line = br.readLine();
			int tmp = 0;
			for (int j = 0; j < line.length(); j++) {
				char c = line.charAt(j);
				if (c >= '1' && c <= '9') {
					rank[c - '1'] = tmp;
					break;
				}
				tmp++;
			}
		}

		int max = C - 2;
		int currentRank = 1;
		int[] output = new int[9];
		boolean flag;

		while (max > 0) {
			flag = false;
			for (int i = 0; i < 9; i++) {
				if (rank[i] == max) {
					output[i] = currentRank;
					flag = true;
				}
			}
			if (flag)
				currentRank++;

			max--;
		}

		for (int i = 0; i < 9; i++)
			System.out.println(output[i]);
	}
}