import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] scores = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(s[i]);
            max = Math.max(max, scores[i]);
        }

        double avg = 0.0;

        for (int i = 0; i < n; i++) {
            avg += (double) scores[i] / max * 100;
        }
        avg /= n;

        System.out.println(avg);
    }
}