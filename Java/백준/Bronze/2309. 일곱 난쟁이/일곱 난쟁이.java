import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarfs = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
            sum += dwarfs[i];
        }

        Arrays.sort(dwarfs);

        for (int i = 0; i < dwarfs.length - 1; i++) {
            for (int j = i + 1; j < dwarfs.length; j++) {
                int tmp = dwarfs[i] + dwarfs[j];
                if (sum - tmp == 100) {
                    dwarfs[i] = 100;
                    dwarfs[j] = 100;
                    break;
                }
            }
            if (dwarfs[i] == 100) {
                break;
            }
        }
        Arrays.sort(dwarfs);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dwarfs.length - 2; i++) {
            sb.append(dwarfs[i]).append("\n");
        }
        System.out.println(sb);
    }
}