import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(n));
            sb.append(" ".repeat(3 * n));
            sb.append("@".repeat(n));
            sb.append('\n');
        }

        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(n));
            sb.append(" ".repeat(2 * n));
            sb.append("@".repeat(n));
            sb.append('\n');
        }

        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(3 * n));
            sb.append('\n');
        }

        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(n));
            sb.append(" ".repeat(2 * n));
            sb.append("@".repeat(n));
            sb.append('\n');
        }

        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(n));
            sb.append(" ".repeat(3 * n));
            sb.append("@".repeat(n));
            sb.append('\n');
        }

        System.out.println(sb);
    }
}