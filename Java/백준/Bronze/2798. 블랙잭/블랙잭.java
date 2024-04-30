import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println(blackJack());
    }

    static public int blackJack() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Integer[] cards = new Integer[n];
        for(int i = 0; i < n; i++){
            cards[i] = scanner.nextInt();
        }

        int sum = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){
                for(int k = 2; k < n; k++){
                    if(i == j || j == k || i == k){
                        break;
                    }
                    sum = cards[i] + cards[j] + cards[k];
                    if(sum <= m){
                        if(max < sum){
                            max = sum;
                        }
                    }
                }
            }
        }

        return max;
    }
}