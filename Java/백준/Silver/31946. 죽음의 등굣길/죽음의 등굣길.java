import java.util.Scanner;

public class Main {
    public static boolean visited[][];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] field = new int[x][y];
        visited = new boolean[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                field[i][j] = scanner.nextInt();
            }
        }
        int jump = scanner.nextInt();

        int criteria = field[0][0];
        boolean result = commuteOfDeath(field, jump, criteria, 0, 0);

        if (result) {
            System.out.println("ALIVE");
        } else {
            System.out.println("DEAD");
        }
    }

    private static boolean commuteOfDeath(int[][] field, int jump, int criteria, int x, int y) {
        if (x == field.length - 1 && y == field[0].length - 1) {
            return true;
        }

        for (int i = -jump; i <= jump; i++) {
            for (int j = -jump; j <= jump; j++) {
                if (Math.abs(i) + Math.abs(j) > jump) {
                    continue;
                }
                int newX = x + i;
                int newY = y + j;
                if (newX < 0 || newY < 0
                        || newX >= field.length || newY >= field[0].length
                        || visited[newX][newY]) {
                    continue;
                }

                if (field[newX][newY] == criteria) {
                    visited[newX][newY] = true;
                    if (commuteOfDeath(field, jump, criteria, newX, newY)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}