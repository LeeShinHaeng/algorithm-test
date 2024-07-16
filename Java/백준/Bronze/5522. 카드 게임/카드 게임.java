import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long sum = 0L;
        for (int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }

        System.out.println(sum);
    }
}