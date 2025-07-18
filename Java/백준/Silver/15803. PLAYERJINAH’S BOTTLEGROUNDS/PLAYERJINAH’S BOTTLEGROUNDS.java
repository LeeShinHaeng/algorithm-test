import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] pos = new int[3][2];
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			pos[i][0] = Integer.parseInt(st.nextToken());
			pos[i][1] = Integer.parseInt(st.nextToken());
		}
		boolean isInLine =
			(long) (pos[1][0] - pos[0][0]) * (pos[2][1] - pos[0][1]) == (long) (pos[1][1] - pos[0][1]) * (pos[2][0] - pos[0][0]);
		System.out.println(isInLine ? "WHERE IS MY CHICKEN?" : "WINNER WINNER CHICKEN DINNER!");
	}
}