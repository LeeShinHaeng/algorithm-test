import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] fees = new int[n];
        int jinjuFee = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            if (input[0].equals("jinju")) {
                jinjuFee = Integer.parseInt(input[1]);
                for (int j = 0; j < i; j++) {
                    if (jinjuFee < fees[j]) {
                        result++;
                    }
                }
            } else if (jinjuFee != 0) {
                if (jinjuFee < Integer.parseInt(input[1])) {
                    result++;
                }
            } else {
                fees[i] = Integer.parseInt(input[1]);
            }
        }
        System.out.println(jinjuFee);
        System.out.println(result);
    }
}