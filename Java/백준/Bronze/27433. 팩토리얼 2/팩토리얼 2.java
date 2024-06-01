import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println(factorial2(input));
    }

    private static long factorial2(long input) {
        if(input <= 0){
            return 1;
        }
        return factorial2(input-1) * input;
    }
}

