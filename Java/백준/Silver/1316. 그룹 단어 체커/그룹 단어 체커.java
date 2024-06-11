import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < size; i++) {
            String tmp = scanner.next();
            if (isGroupString(tmp)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isGroupString(String input) {
        ArrayList<Character> list = new ArrayList<>();
        list.add(' ');
        for (int i = 0; i < input.length(); i++) {
            char tmp = input.charAt(i);
            if (list.contains(tmp)) {
                if (list.get(list.size()-1) != tmp) {
                    return false;
                }
            } else {
                list.add(tmp);
            }
        }
        return true;
    }
}
