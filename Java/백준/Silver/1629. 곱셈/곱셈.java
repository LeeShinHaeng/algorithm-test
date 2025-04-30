import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static long C;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");

		long A = Long.parseLong(s[0]);
		long B = Long.parseLong(s[1]);
		C = Long.parseLong(s[2]);

		System.out.println(power(A, B));
	}

	static long power(long base, long exp) {
		if (exp == 1) 
			return base % C;

		long halfExp = power(base, exp / 2);

		if (exp % 2 == 1)
			return (halfExp * halfExp % C) * base % C;

		return halfExp * halfExp % C;
	}
}