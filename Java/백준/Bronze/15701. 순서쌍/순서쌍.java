import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int count = 0;
        int i;
        for (i = 1; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                count += 2;
            }
            if (input == i * i) {
                count--;
            }
        }

        System.out.println(count);
    }
}