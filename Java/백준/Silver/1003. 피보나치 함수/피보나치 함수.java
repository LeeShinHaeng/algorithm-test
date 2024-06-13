import java.util.Scanner;

public class Main {
    public static int[][] memo = new int[41][2];

    public static void main(String[] args) {
        memo[0][0] = 1;
        memo[0][1] = 0;
        memo[1][0] = 0;
        memo[1][1] = 1;
        
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for(int i = 0; i < size; i++){
            int n = scanner.nextInt();
            fibonacci(n);
            System.out.println(memo[n][0] + " " + memo[n][1]);
        }
    }
    static int[] fibonacci(int n){
        if(memo[n][0] == 0 || memo[n][1] == 0){
            for(int i = 2; i < 41; i++){
                memo[i][0] = memo[i-1][0] + memo[i-2][0];
                memo[i][1] = memo[i-1][1] + memo[i-2][1];
            }
        }
        return memo[n];
    }
}