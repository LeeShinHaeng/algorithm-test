import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        numberCard();
    }

    private static void numberCard() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] had = new int[n];

        for (int i = 0; i < n; i++) {
            had[i] = scanner.nextInt();
        }

        Arrays.sort(had);

        int m = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            result.append(binarySearch(had, n, scanner.nextInt()) + " ");
        }

        System.out.println(result);
    }

    public static int binarySearch(int[] cards, int N, int search) {
        int first = 0;
        int last = N - 1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last) / 2;

            if (cards[mid] == search) {
                return 1;
            }

            if (cards[mid] < search) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return 0;
    }
}

