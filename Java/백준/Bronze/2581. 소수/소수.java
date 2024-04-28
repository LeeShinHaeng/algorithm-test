import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        primeNumber();
    }

    static public void primeNumber(){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int sum = 0;
        int min = 0;

        for (int i = n; i >= m; i--){
            if(isPrime(i)){
                min = i;
                sum += i;

            }
        }
        if(min == 0){
            System.out.println(-1);
        } else{
            System.out.println(sum);
            System.out.println(min);
        }
    }

    private static boolean isPrime(int input) {
        if(input < 2){
            return false;
        }

        for(int i = 2; i < input; i++){
            if(input % i == 0){
                return false;
            }
        }

        return true;
    }
}