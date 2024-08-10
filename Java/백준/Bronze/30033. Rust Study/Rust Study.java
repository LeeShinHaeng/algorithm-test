import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        int tmp1;
        int tmp2;
        int count = 0;
        for (int i = 0; i < tc; i++) {
            tmp1 = Integer.parseInt(s1[i]);
            tmp2 = Integer.parseInt(s2[i]);

            if (tmp2 >= tmp1) {
                count++;
            }
        }

        System.out.println(count);
    }
}