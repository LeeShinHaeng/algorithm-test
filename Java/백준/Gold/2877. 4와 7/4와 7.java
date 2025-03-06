import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(init(n));
	}

	private static String init(int n) {
		if (n == 0) return "7";
		if (n == 1) return "4";
		if (n == 2) return "7";
		int k = (n - 1) / 2;
		return init(k) + init(n % 2);
	}
}