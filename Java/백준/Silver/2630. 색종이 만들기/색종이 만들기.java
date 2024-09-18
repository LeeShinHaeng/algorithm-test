import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    static int[][] paper;
    static int blue;
    static int white;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];
        String[] s;
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                paper[i][j] = Integer.parseInt(s[j]);
            }
        }

        blue = 0;
        white = 0;
        recursion(n, 0, 0);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void recursion(int len, int r, int c) {
        if (isAllSame(len, r, c)) {
            if (paper[r][c] == 1) {
                blue++;
            } else {
                white++;
            }
        } else {
            int tmp = len / 2;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    recursion(tmp, r + i * tmp, c + j * tmp);
                }
            }
        }
    }

    private static boolean isAllSame(int len, int r, int c) {
        int first = paper[r][c];
        for (int i = r; i < r + len; i++) {
            for (int j = c; j < c + len; j++) {
                if (paper[i][j] != first) {
                    return false;
                }
            }
        }
        return true;
    }
}