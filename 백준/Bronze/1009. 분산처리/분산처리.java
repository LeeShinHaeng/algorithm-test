import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        distributedProcessing();
    }

    public static void distributedProcessing() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            StringTokenizer tokenizer = new StringTokenizer(input);

            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());

            if (a % 10 == 0) {
                System.out.println(10);
                continue;
            }
            int result = 1;
            for (int j = 1; j <= b; j++) {
                result = (result * a) % 10;
            }
            System.out.println(result);
        }
    }
}