import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int nOfCow = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);
        int h = Integer.parseInt(s[2]);
        int l = Integer.parseInt(s[3]);

        int a = w / l;
        int b = h / l;

        System.out.println(Math.min(nOfCow, a * b));
    }
}