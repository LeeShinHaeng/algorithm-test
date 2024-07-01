import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);
            if (a == 0 && b == 0 && c == 0) {
                return;
            }
            System.out.println(check(a, b, c));
        }
    }

    private static String check(int a, int b, int c) {
        int max = a;
        int idx = 1;
        if (max < b) {
            max = b;
            idx = 2;
        }
        if (max < c) {
            max = c;
            idx = 3;
        }

        long square = (long) max * max;
        long sum = 0;
        switch (idx) {
            case 1:
                sum = (long) b * b + (long) c * c;
                if (sum == square) {
                    return "right";
                }
                return "wrong";
            case 2:
                sum = (long) a * a + (long) c * c;
                if (sum == square) {
                    return "right";
                }
                return "wrong";
            case 3:
                sum = (long) b * b + (long) a * a;
                if (sum == square) {
                    return "right";
                }
                return "wrong";

        }
        return "wrong";
    }
}