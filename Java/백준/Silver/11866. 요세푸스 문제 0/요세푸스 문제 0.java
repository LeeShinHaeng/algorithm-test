import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        josephProblem(n, k - 1);
    }

    public static void josephProblem(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int bomb = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        sb.append("<");
        while (!list.isEmpty()) {
            bomb += k;
            bomb %= n;

            sb.append(list.get(bomb)).append(", ");
            list.remove(bomb);
            n--;
        }
        sb.deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1);
        sb.append(">");

        System.out.println(sb);
    }
}