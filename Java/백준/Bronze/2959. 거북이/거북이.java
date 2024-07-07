import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] tmp = br.readLine().split(" ");
        int[] input = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            input[i] = Integer.parseInt(tmp[i]);
        }
        Arrays.sort(input);

        System.out.println(input[0] * input[2]);
    }
}