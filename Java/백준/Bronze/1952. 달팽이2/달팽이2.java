import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        boolean[][] visited = new boolean[a][b];

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int count = 0;
        int dir = 0;
        int nowX = 0, nowY = 0;

        for (int i = 0; i < a * b - 1; i++) { // 끝까지 순회하지 않도록 수정
            visited[nowX][nowY] = true;

            int nextX = nowX + dx[dir];
            int nextY = nowY + dy[dir];

            if (nextX < 0 || nextX >= a || nextY < 0 || nextY >= b || visited[nextX][nextY]) {
                dir = (dir + 1) % 4;
                count++;

                nextX = nowX + dx[dir];
                nextY = nowY + dy[dir];
            }

            nowX = nextX;
            nowY = nextY;
        }

        System.out.println(count);
    }
}
