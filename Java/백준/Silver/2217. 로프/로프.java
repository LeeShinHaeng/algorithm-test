import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ropes = new int[n];
        for (int i = 0; i < n; i++) {
            ropes[i] = sc.nextInt();
        }

        Arrays.sort(ropes);
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (ropes[i] * (n - i) > max) {
                max = ropes[i] * (n - i);
            }
        }
        System.out.println(max);
    }
}