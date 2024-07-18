import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n <= 0) {
                break;
            }

            sb.append(count++).append(". ");
            if (n % 2 == 0) {
                sb.append("even ").append(n / 2);
            } else {
                sb.append("odd ").append((n - 1) / 2);
            }

            System.out.println(sb);
            sb.setLength(0);
        }
    }
}