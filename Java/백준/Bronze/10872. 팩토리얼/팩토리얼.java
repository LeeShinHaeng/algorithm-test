import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        System.out.println(factorial(input));
    }

    static public long factorial(int input) {
        if(input <= 0){
            return 1;
        }

        return input * factorial(input-1);
    }
}