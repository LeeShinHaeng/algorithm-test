import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();

		int n = s1.length();
		int m = s2.length();
		int[][] counts = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1))
					counts[i][j] = counts[i - 1][j - 1] + 1;
				else
					counts[i][j] = Math.max(counts[i - 1][j], counts[i][j - 1]);
			}
		}
        
		System.out.println(counts[n][m]);
	}
}