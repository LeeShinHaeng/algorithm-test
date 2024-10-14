import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        Map<String, Integer> nameToNumber = new HashMap<>();
        Map<Integer, String> numberToName = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String input = br.readLine();
            nameToNumber.put(input, i);
            numberToName.put(i, input);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            try {
                bw.write(numberToName.get(Integer.parseInt(input)));
            } catch (Exception e) {
                bw.write(nameToNumber.get(input) + "");
            }
            bw.newLine();
        }
        bw.flush();
    }
}