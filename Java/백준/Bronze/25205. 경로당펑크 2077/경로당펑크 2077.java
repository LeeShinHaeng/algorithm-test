import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] moeums = {
                'k', 'i', 'j', 'u', 'h',
                'y', 'n', 'b', 'm', 'l',
                'o', 'p'
        };

        String s = br.readLine();
        s = br.readLine();
        char c = s.charAt(s.length() - 1);
        for (int i = 0; i < moeums.length; i++) {
            if (c == moeums[i]) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}