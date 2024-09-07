import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double a = n * 0.78;
        double b = n * 0.8 + n * 0.2 * 0.78;

        System.out.printf("%.0f %.0f", a, b);
    }
}