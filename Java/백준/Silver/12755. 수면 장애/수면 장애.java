import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int digit = 1;
		int count = 9;

		while (N > digit * count) {
			N -= digit * count;
			digit++;
			count *= 10;
		}

		int number = (int) (Math.pow(10, digit - 1) + (double) (N - 1) / digit);
		int digitIndex = (N - 1) % digit;

		int answer = extractDigit(number, digitIndex, digit);
		System.out.println(answer);
	}

	private static int extractDigit(int num, int index, int digitCount) {
		for (int i = 0; i < digitCount - index - 1; i++) {
			num /= 10;
		}
		return (num % 10);
	}
}