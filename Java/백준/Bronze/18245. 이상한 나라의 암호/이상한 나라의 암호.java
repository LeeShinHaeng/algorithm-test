import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (true) {
            String s = br.readLine();
            if (s.equals("Was it a cat I saw?")) break;

            i++;
            for (int j = 0; j < s.length(); j++) {
                if (j % i == 0) {
                    sb.append(s.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}