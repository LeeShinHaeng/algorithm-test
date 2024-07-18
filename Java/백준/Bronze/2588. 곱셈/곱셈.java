import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String inputB = br.readLine();
        int b = Integer.parseInt(inputB);

        for (int i = 2; i >= 0; i--) {
            char tmp = inputB.charAt(i);
            int digit = tmp - '0';
            System.out.println(a * digit);
        }

        System.out.println(a * b);
    }
}