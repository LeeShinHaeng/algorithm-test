import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		BigInteger n = new BigInteger(input);
		StringBuilder sb = new StringBuilder();
		boolean found = false;

		for (int base = 2; base <= 10; base++) {
			String converted = convert(n, BigInteger.valueOf(base));
			if (isPalindrome(converted)) {
				sb.append(base).append(" ").append(converted).append("\n");
				found = true;
			}
		}
		if (!found)
			sb.append("NIE");

		System.out.println(sb);
	}

	public static String convert(BigInteger n, BigInteger base) {
		if (n.equals(BigInteger.ZERO)) return "0";
		StringBuilder sb = new StringBuilder();
		while (n.compareTo(BigInteger.ZERO) > 0) {
			BigInteger[] divRem = n.divideAndRemainder(base);
			sb.append(divRem[1].toString());
			n = divRem[0];
		}
		return sb.toString();
	}

	public static boolean isPalindrome(String str) {
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i))
				return false;
		}
		return true;
	}
}