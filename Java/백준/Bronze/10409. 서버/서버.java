import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int max = scan.nextInt();
        int i = 0;
        for (i = 0; i < size; i++) {
            int tmp = scan.nextInt();
            max -= tmp;
            if (max < 0) {
                break;
            }
        }
        System.out.println(i);
    }
}