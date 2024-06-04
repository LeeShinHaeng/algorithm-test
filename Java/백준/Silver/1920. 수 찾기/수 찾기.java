import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findItIs();
    }

    private static void findItIs() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        num = scanner.nextInt();

        int tmp;
        for (int i = 0; i < num; i++) {
            tmp = scanner.nextInt();
            if (Arrays.binarySearch(arr, tmp) >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}