import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(isGroupString(score));
    }

    private static char isGroupString(int input) {
        if (input >= 90) {
            return 'A';
        } else if (input >= 80) {
            return 'B';
        } else if (input >= 70) {
            return 'C';
        } else if (input >= 60) {
            return 'D';
        }
        return 'F';
    }
}