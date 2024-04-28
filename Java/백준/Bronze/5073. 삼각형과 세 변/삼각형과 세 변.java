import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        trianglesLine();
    }

    static public void trianglesLine() {
        Scanner scanner = new Scanner(System.in);

        String[] lists = {
                "Equilateral", "Isosceles", "Scalene", "Invalid"
        };

        ArrayList<String> lines = new ArrayList<>();
        int[] tmp = new int[3];


        while (true) {
            for (int i = 0; i < 3; i++) {
                tmp[i] = scanner.nextInt();
            }

            if (tmp[0] == 0 && tmp[1] == 0 && tmp[2] == 0) {
                break;
            } else if (tmp[0] == tmp[1] && tmp[2] == tmp[1]) {
                lines.add(lists[0]);
            } else if (invalid(tmp)) {
                lines.add(lists[3]);
            } else if (isosceles(tmp)) {
                lines.add(lists[1]);
            } else {
                lines.add(lists[2]);
            }

        }
        for (String line : lines) {
            System.out.println(line);
        }
    }

    private static boolean invalid(int[] input) {
        int max = input[0];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            if (max < input[i]) {
                max = input[i];
            }
            sum += input[i];
        }

        if (max >= (sum - max)) {
            return true;
        }
        return false;
    }

    private static boolean isosceles(int[] input) {
        if (input[0] == input[1]
                || input[1] == input[2]
                || input[0] == input[2]) {
            return true;
        }

        return false;
    }
}