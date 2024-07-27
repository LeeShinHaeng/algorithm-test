import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            sb.append("Case ").append(i + 1).append(": ").append(a + b).append("\n");
        }
        System.out.println(sb);
    }
}