import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String tmp;
        for (int i = 0; i < size; i++) {
            tmp = scanner.next();
            System.out.println(checkString(tmp));
        }
    }

    private static String checkString(String inp) {
        int count = 0;
        for (int j = 0; j < inp.length(); j++) {
            if (inp.charAt(j) == '(') {
                count++;
            } else if (inp.charAt(j) == ')') {
                if (count == 0) {
                    return "NO";
                }
                count--;
            } else {
                return "NO";
            }
        }
        if (count == 0) {
            return "YES";
        }
        return "NO";
    }
}
