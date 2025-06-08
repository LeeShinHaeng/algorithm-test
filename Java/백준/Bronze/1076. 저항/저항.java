import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Main {
    static Map<String, Integer> valueMap = new HashMap<>();
    static Map<String, Long> weightMap = new HashMap<>();

    public static void main(String[] args) throws Exception {
        valueMap.put("black", 0);
        valueMap.put("brown", 1);
        valueMap.put("red", 2);
        valueMap.put("orange", 3);
        valueMap.put("yellow", 4);
        valueMap.put("green", 5);
        valueMap.put("blue", 6);
        valueMap.put("violet", 7);
        valueMap.put("grey", 8);
        valueMap.put("white", 9);

        weightMap.put("black", 1L);
        weightMap.put("brown", 10L);
        weightMap.put("red", 100L);
        weightMap.put("orange", 1_000L);
        weightMap.put("yellow", 10_000L);
        weightMap.put("green", 100_000L);
        weightMap.put("blue", 1_000_000L);
        weightMap.put("violet", 10_000_000L);
        weightMap.put("grey", 100_000_000L);
        weightMap.put("white", 1_000_000_000L);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        int value = valueMap.get(s1) * 10 + valueMap.get(s2);
        long weight = weightMap.get(s3);
        System.out.println(value * weight);
    }
}