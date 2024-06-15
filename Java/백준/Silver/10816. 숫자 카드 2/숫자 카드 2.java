import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        numOfCards();
    }

    static void numOfCards() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> map = new HashMap<>();

        int size = Integer.parseInt(reader.readLine());

        String[] cardInputs = reader.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            int tmp = Integer.parseInt(cardInputs[i]);
            map.put(tmp, map.getOrDefault(tmp, 0) + 1);
        }

        size = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        String[] queryInputs = reader.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            int key = Integer.parseInt(queryInputs[i]);
            sb.append(map.getOrDefault(key, 0)).append(' ');
        }

        System.out.println(sb);
    }
}