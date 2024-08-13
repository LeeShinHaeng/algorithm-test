import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[1]);

        Map<Integer, Integer> priceCount = new HashMap<>();
        String[][] input = new String[n][2];

        for (int i = 0; i < n; i++) {
            input[i] = br.readLine().split(" ");
            int price = Integer.parseInt(input[i][1]);
            priceCount.put(price, priceCount.getOrDefault(price, 0) + 1);
        }

        String minPriceString = getString(priceCount);
        for (int i = 0; i < n; i++) {
            if (input[i][1].equals(minPriceString)) {
                System.out.println(input[i][0] + " " + input[i][1]);
                break;
            }
        }
    }

    private static String getString(Map<Integer, Integer> priceCount) {
        int min = Integer.MAX_VALUE;
        int minPrice = -1;
        for (Map.Entry<Integer, Integer> entry : priceCount.entrySet()) {
            if (min > entry.getValue()) {
                min = entry.getValue();
                minPrice = entry.getKey();
            }

            if (min == entry.getValue()) {
                if (minPrice > entry.getKey()) {
                    minPrice = entry.getKey();
                }
            }
        }

        return String.valueOf(minPrice);
    }
}