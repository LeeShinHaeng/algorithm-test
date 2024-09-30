import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    static char[][] board;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        String s = br.readLine();
        int curX = 0, curY = 0, nextX = 0, nextY = 0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            switch (c) {
                case 'R':
                    nextY = curY + 1;
                    if (nextY >= n) {
                        nextY = curY;
                        break;
                    }
                    draw(curX, curY, '-');
                    draw(nextX, nextY, '-');
                    curY = nextY;
                    break;
                case 'L':
                    nextY = curY - 1;
                    if (nextY < 0) {
                        nextY = curY;
                        break;
                    }
                    draw(curX, curY, '-');
                    draw(nextX, nextY, '-');
                    curY = nextY;
                    break;
                case 'U':
                    nextX = curX - 1;
                    if (nextX < 0) {
                        nextX = curX;
                        break;
                    }
                    draw(curX, curY, '|');
                    draw(nextX, nextY, '|');
                    curX = nextX;
                    break;
                case 'D':
                    nextX = curX + 1;
                    if (nextX >= n) {
                        nextX = curX;
                        break;
                    }
                    draw(curX, curY, '|');
                    draw(nextX, nextY, '|');
                    curX = nextX;
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(board[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void draw(int x, int y, char c) {
        char cur = board[x][y];
        switch (cur) {
            case '.':
                board[x][y] = c;
                break;
            case '-':
                if (c == '-')
                    break;
                board[x][y] = '+';
                break;
            case '|':
                if (c == '|')
                    break;
                board[x][y] = '+';
            case '+':
                break;
        }
    }
}