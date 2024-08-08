import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int LEN = 1001;
    static boolean[] isPrime = new boolean[LEN];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        int count = 0;
        initIsPrime();

        for (int i = 0; i < tc; i++) {
            int num = Integer.parseInt(s[i]);
            if (isPrime[num]) count++;
        }

        System.out.println(count);
    }

    private static void initIsPrime() {
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(LEN - 1); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < LEN; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}