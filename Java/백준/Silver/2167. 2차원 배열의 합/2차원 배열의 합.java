import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int sum = 0;

            for (int j = a; j <= x; j++) {
                for (int k = b; k <= y; k++) {
                    sum += arr[j - 1][k - 1];
                }
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}