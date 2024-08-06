import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long heads = Long.parseLong(br.readLine());

        String[] s = br.readLine().split(" ");
        long[] shirts = new long[6];
        for (int i = 0; i < 6; i++) {
            shirts[i] = Long.parseLong(s[i]);
        }

        s = br.readLine().split(" ");
        long t = Long.parseLong(s[0]);
        long p = Long.parseLong(s[1]);

        long countT = 0;
        for (int i = 0; i < 6; i++) {
            if (shirts[i] % t == 0) {
                countT += shirts[i] / t;
                continue;
            }
            countT += (shirts[i] / t) + 1;
        }
        System.out.println(countT);

        System.out.println(heads / p + " " + heads % p);
    }
}