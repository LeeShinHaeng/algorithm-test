import java.io.*;
import java.util.*;

public class Main {
    public static int[] memo;

    public static void main(String[] args) throws IOException {
        continuousSum();
    }

    static void continuousSum() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        memo = new int[size];

        String inputStream = br.readLine();
        StringTokenizer st = new StringTokenizer(inputStream);
        int[] inputs = new int[size];
        for(int i = 0; i < size; i++) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        int max = inputs[0];
        memo[0] = inputs[0];
        for(int i = 1; i < size; i++){
            memo[i] = Math.max(memo[i-1] + inputs[i], inputs[i]);
            max = Math.max(max, memo[i]);
        }
        bw.write(max + "");
        bw.flush();
    }
}