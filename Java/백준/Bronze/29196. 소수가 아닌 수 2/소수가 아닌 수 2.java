import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double input = Double.parseDouble(br.readLine());

		int result = (int) (input * 1_000_000_000);
		System.out.println("YES\n" + result + " 1000000000");
	}
}
