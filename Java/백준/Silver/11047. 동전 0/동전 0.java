import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] condition = br.readLine().split(" ");
        int n = Integer.parseInt(condition[0]);
        int total = Integer.parseInt(condition[1]);
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if(coins[i] <= 0){
                break;
            }

            int divide = total / coins[i];
            if(divide >= 1) {
                count += divide;
                total -= divide * coins[i];
            }
        }

        System.out.println(count);
    }
}