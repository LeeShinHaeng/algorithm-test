import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        BigInteger n = new BigInteger(s);
        BigInteger m = new BigInteger("2");
        int ans = 64;

        while (n.mod(m).equals(BigInteger.ZERO)) {
            n = n.divide(m);
            ans--;
        }

        System.out.println(ans);
    }
}