import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        kuganHap();
    }

    public static void kuganHap(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];
        arr[0] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i] = scanner.nextInt() + arr[i - 1];
        }

        for (int i = 0; i < m; i++) {
            int first = scanner.nextInt() - 1;
            int last = scanner.nextInt() - 1;

            if (first == 0) {
                System.out.println(arr[last]);
            } else {
                System.out.println(arr[last] - arr[first - 1]);
            }
        }
    }
}