import java.util.Scanner;

public class Main {
    public static int[] memo;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        memo = new int[inp + 1];
        if (inp < 2) {
            System.out.println(0);
            return;
        }
        if (inp < 4) {
            System.out.println(1);
            return;
        }
        memo[0] = 0;
        memo[1] = 0;
        memo[2] = 1;
        memo[3] = 1;
        System.out.println(makeItOne(inp));
    }

    private static int makeItOne(int inp) {
        for (int i = 4; i <= inp; i++) {
            if (i % 6 == 0) {
                memo[i] = Math.min(Math.min(memo[i / 2], memo[i - 1]), memo[i / 3]) + 1;
            } else if (i % 2 == 0) {
                memo[i] = Math.min(memo[i / 2], memo[i - 1]) + 1;
            } else if (i % 3 == 0) {
                memo[i] = Math.min(memo[i / 3], memo[i - 1]) + 1;
            } else {
                memo[i] = memo[i - 1] + 1;
            }
        }

        return memo[inp];
    }
}