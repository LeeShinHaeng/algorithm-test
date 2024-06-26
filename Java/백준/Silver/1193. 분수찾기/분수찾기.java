import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        fractionsTable();
    }

    public static void fractionsTable() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int firstRow = 1;
        int i;
        for (i = 1; i <= n; i++) {
            firstRow += i;
            if (firstRow > n) {
                firstRow -= i;
                break;
            }
        }
        i++;

        int bunja = 1 + (n - firstRow);
        int bunmo = i - 1 - (n - firstRow);
        if (i % 2 == 0) {
            System.out.println(bunmo + "/" + bunja);
        } else {
            System.out.println(bunja + "/" + bunmo);
        }
    }
}
