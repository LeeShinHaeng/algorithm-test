import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] s = br.readLine().split(" ");
        int r = Integer.parseInt(s[0]);
        int c = Integer.parseInt(s[1]);
        char[][] matrix = new char[r][c];
        for (int i = 0; i < r; i++) {
            s = br.readLine().split("");
            for (int j = 0; j < c; j++) {
                matrix[i][j] = s[j].charAt(0);
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 'S') {
                    if (i > 0 && matrix[i - 1][j] == '.') {
                        matrix[i - 1][j] = 'D';
                    } else if (i > 0 && matrix[i - 1][j] == 'W') {
                        System.out.println(0);
                        return;
                    }
                    if (i < r - 1 && matrix[i + 1][j] == '.') {
                        matrix[i + 1][j] = 'D';
                    } else if (i < r - 1 && matrix[i + 1][j] == 'W') {
                        System.out.println(0);
                        return;
                    }
                    if (j > 0 && matrix[i][j - 1] == '.') {
                        matrix[i][j - 1] = 'D';
                    } else if (j > 0 && matrix[i][j - 1] == 'W') {
                        System.out.println(0);
                        return;
                    }
                    if (j < c - 1 && matrix[i][j + 1] == '.') {
                        matrix[i][j + 1] = 'D';
                    } else if (j < c - 1 && matrix[i][j + 1] == 'W') {
                        System.out.println(0);
                        return;
                    }
                }
            }
        }

        sb.append('1').append("\n");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sb.append(matrix[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
