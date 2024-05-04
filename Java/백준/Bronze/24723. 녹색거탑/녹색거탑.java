import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        greenTower();
    }

    static public void greenTower() {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int output = 1;
        for(int i = 0; i < input; i++){
            output *= 2;
        }

        System.out.println(output);
    }
}