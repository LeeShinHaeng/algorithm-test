import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count2 = 0, count0 = 0, count1 = 0, count8 = 0;

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '2') count2++;
            else if (c == '0') count0++;
            else if (c == '1') count1++;
            else if (c == '8') count8++;
            else {
                System.out.println(0);
                return;
            }
        }

        if (count2 > 0 && count0 > 0 && count1 > 0 && count8 > 0) {
            if (count2 == count0 && count2 == count1 && count2 == count8) {
                System.out.println(8);
                return;
            }
            System.out.println(2);
            return;
        }
        System.out.println(1);

    }
}