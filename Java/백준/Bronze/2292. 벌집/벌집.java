import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println(beeHouse());
    }

    static public int beeHouse() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int count = 1;
        int range = 2;

        if (input == 1) {
            return 1;
        }

        while (range <= input) {
            range += 6 * count;
            count++;
        }
        return count;

    }
}