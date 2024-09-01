import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        BigInteger bigN = BigInteger.valueOf(n);
        BigInteger left = BigInteger.ZERO;
        BigInteger right = BigInteger.valueOf(n);
        BigInteger result = BigInteger.ZERO;

        while (left.compareTo(right) <= 0) {
            BigInteger mid = left.add(right).divide(BigInteger.valueOf(2));
            BigInteger midSquared = mid.multiply(mid);

            if (midSquared.compareTo(bigN) >= 0) {
                result = mid;
                right = mid.subtract(BigInteger.ONE);
            } else {
                left = mid.add(BigInteger.ONE);
            }
        }

        System.out.println(result);
    }
}