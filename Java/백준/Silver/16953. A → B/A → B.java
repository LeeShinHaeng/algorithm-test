import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        int count = 1;
        while (b != a) {
            if (b < a) {
                count = -1;
                break;
            }

            if (b % 10 == 1) {
                b /= 10;
            } else if (b % 2 == 0) {
                b /= 2;
            } else {
                count = -1;
                break;
            }
            count++;
        }

        System.out.println(count);
    }
}