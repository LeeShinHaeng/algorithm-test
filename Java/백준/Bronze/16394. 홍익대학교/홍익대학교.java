import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final int EST = 1946;

    public static void main(String[] args) throws IOException {
        int inp = Integer.parseInt(br.readLine());

        System.out.println(inp - EST);
    }
}