import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input >= 100) {
                sum += input;
                continue;
            }
            if (input >= 10) {
                int ten = input / 10;
                if (ten == 0 || ten == 9 || ten == 6) {
                    ten = 9;
                }
                sum += ten * 10;
            }
            int one = input % 10;
            if (one == 0 || one == 9 || one == 6) {
                one = 9;
            }
            sum += one;
        }
        System.out.println(Math.round((double) sum / n));
    }
}