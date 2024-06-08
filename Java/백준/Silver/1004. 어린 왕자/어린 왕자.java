import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lePetitPrince();
    }

    public static void lePetitPrince() {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int result = 0;
            int[] start = new int[2];
            int[] goal = new int[2];
            start[0] = scanner.nextInt();
            start[1] = scanner.nextInt();
            goal[0] = scanner.nextInt();
            goal[1] = scanner.nextInt();

            int size = scanner.nextInt();
            int[] circles = new int[3];
            boolean[] startChecker = new boolean[size];
            boolean[] goalChecker = new boolean[size];

            for (int j = 0; j < size; j++) {
                for (int k = 0; k < 3; k++) {
                    circles[k] = scanner.nextInt();
                }
                if (isInTheCircle(start, circles)) {
                    startChecker[j] = true;
                }
                if (isInTheCircle(goal, circles)) {
                    goalChecker[j] = true;
                }
            }

            for (int j = 0; j < size; j++) {
                if (startChecker[j] != goalChecker[j]) {
                    result++;
                }
            }

            System.out.println(result);
        }
    }

    private static boolean isInTheCircle(int[] point, int[] circles) {
        int x = Math.abs(circles[0] - point[0]);
        int y = Math.abs(circles[1] - point[1]);

        if (circles[2] * circles[2] < (x * x) + (y * y)) {
            return true;
        }
        return false;
    }
}
