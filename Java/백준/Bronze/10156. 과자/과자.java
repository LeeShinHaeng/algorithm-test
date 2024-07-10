import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");

        int k = Integer.parseInt(input[0]);     // 한개의 가격
        int n = Integer.parseInt(input[1]);     // 과자의 개수
        int m = Integer.parseInt(input[2]);     // 현재 가진 돈

        System.out.println(Math.max(k * n - m, 0));
    }
}