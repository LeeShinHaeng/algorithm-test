import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dir = 0;
        for (int i = 0; i < 10; i++) {
            int tmp = scan.nextInt();
            dir += tmp;
            if (dir > 3) {
                dir %= 4;
            }
        }
        
        switch (dir) {
            case 0:
                System.out.println('N');
                return;
            case 1:
                System.out.println('E');
                return;
            case 2:
                System.out.println('S');
                return;
        }
        System.out.println('W');
    }
}