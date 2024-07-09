import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int students = Integer.parseInt(input[0]);
        int end = Integer.parseInt(input[1]);
        int cycle;
        boolean[] table = new boolean[end + 1];

        for (int i = 0; i < students; i++) {
            cycle = Integer.parseInt(br.readLine());
            for (int j = 1; j <= end; j++) {
                if (j % cycle == 0) {
                    table[j] = true;
                }
            }
        }

        int result = 0;
        for (int i = 1; i <= end; i++) {
            if (table[i]) {
                result++;
            }
        }
        System.out.println(result);
    }
}
