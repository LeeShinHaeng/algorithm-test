import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        timeComplexity(n);
    }

    public static void timeComplexity(long n){
        System.out.println(n*n);
        System.out.println(2);
    }
}