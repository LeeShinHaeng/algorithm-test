import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        makeDictionary();
    }

    static void makeDictionary() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            if (tmp.length() < m) {
                continue;
            }

            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }

        List<String> words = new ArrayList<>(map.keySet());

        Collections.sort(words, (o1, o2) -> {
            if (map.get(o1) != map.get(o2)) {
                return Integer.compare(map.get(o2), map.get(o1));
            }

            if (o1.length() != o2.length()) {
                return o2.length() - o1.length();
            }

            return o1.compareTo(o2);
        });

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word + "\n");
        }


        bw.write(sb.toString());
        bw.flush();
    }
}