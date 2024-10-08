import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(fibonacci(input));
    }

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        } else if(n == 1 || n == 2){
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}