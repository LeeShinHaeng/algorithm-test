import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int LEN = 100_001;
    static boolean[] isPrime = new boolean[LEN];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        initIsPrime();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i <= k) {
                count++;
                continue;
            }
            if (findMaxPrimeFactor(i) <= k) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static int findMaxPrimeFactor(int n) {
        int max = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i] && (n % i == 0)) {
                max = i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 1 && isPrime[n]) {
            max = n;
        }
        return max;
    }

    private static void initIsPrime() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i < LEN; i++) {
            if (isPrime[i]) {
                for (int j = i * 2; j < LEN; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}