import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String s = br.readLine();

        BigInteger sum = new BigInteger("0");
        BigInteger hash = new BigInteger("1");
        for (int i = 0; i < l; i++) {
            sum = sum.add(BigInteger.valueOf(s.charAt(i) - 'a' + 1).multiply(hash));
            hash = hash.multiply(BigInteger.valueOf(31));
        }
        System.out.println(sum.mod(new BigInteger("1234567891")));
    }
}