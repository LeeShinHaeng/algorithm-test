import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        double a = Integer.parseInt(input[0]);
        double b = Integer.parseInt(input[1]);
        System.out.println(a / b);
    }
}