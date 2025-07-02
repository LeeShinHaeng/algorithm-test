import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());

		int gcd = gcd(R, G);

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= gcd; i++)
			if (gcd % i == 0)
				sb.append(i + " " + R / i + " " + G / i + "\n");

		System.out.println(sb);
	}

	private static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a % b);
	}
}