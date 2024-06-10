import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        pokemon();
    }

    public static void pokemon() {
        Scanner scanner = new Scanner(System.in);
        int dSize = scanner.nextInt();
        int qSize = scanner.nextInt();
        String input;
        HashMap<String, String> dictMap = new HashMap<>();

        for (int i = 0; i < dSize; i++) {
            input = scanner.next();
            dictMap.put(input, String.valueOf(i + 1));
            dictMap.put(String.valueOf(i + 1), input);
        }

        for (int i = 0; i < qSize; i++) {
            String question = scanner.next();
            try {
                Integer.parseInt(question);
                System.out.println(dictMap.get(question));
            } catch (Exception e) {
                System.out.println(dictMap.get(question));
            }
        }
    }
}