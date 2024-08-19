import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        String s = br.readLine();
        Long result = 0L;

        for (int i = 0; i < l; i++) {
            int num = s.charAt(i) - 'a' + 1;
            result += num * (long) Math.pow(31, i);
        }
        System.out.println(result);
    }
}