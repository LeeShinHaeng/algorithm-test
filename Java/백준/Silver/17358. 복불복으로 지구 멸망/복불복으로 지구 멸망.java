import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    private static final long MOD = 1000000007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Long result = calculate(n);
        System.out.println(result % MOD);
    }

    private static Long calculate(long n) {
        if (n <= 2) {
            return 1L;
        }

        long result = 1L;
        for (long i = n; i > 2; i -= 2) {
            result = (result * (i - 1)) % MOD;
        }

        return result;
    }
}