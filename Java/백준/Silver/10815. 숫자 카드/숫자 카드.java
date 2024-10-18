import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String cards = br.readLine();
        StringTokenizer st = new StringTokenizer(cards);

        Set<Integer> cardSet = new HashSet<>();
        while (st.hasMoreTokens()) {
            cardSet.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        String inputs = br.readLine();
        st = new StringTokenizer(inputs);

        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            int input = Integer.parseInt(st.nextToken());
            if (cardSet.contains(input)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb.substring(0, sb.length() - 1));
    }
}