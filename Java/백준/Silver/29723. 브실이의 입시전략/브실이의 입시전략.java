import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int K = Integer.parseInt(s[2]);

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            s = br.readLine().split(" ");
            map.put(s[0], Integer.parseInt(s[1]));
        }

        int currentSum = 0;
        for (int i = 0; i < K; i++) {
            String tmp = br.readLine();
            currentSum += map.remove(tmp);
        }

        int[] scores = new int[map.size()];
        int idx = 0;
        for (Integer value : map.values()) {
            scores[idx++] = value;
        }
        Arrays.sort(scores);

        int min = currentSum;
        int max = currentSum;

        for (int i = 0; i < M - K; i++) {
            min += scores[i];
            max += scores[scores.length - 1 - i];
        }

        System.out.println(min + " " + max);
    }
}