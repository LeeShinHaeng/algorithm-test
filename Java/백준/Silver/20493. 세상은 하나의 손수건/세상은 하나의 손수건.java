import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[][] dir = {
                {1, 0}, {0, -1}, {-1, 0}, {0, 1}
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int t = Integer.parseInt(s[1]);

        int[] pos = {0, 0}; // 현재 위치
        int currentDir = 0; // 현재 보고있는 방향의 인텍스
        int lastSec = 0;    // 직전 command의 시간

        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            int ti = Integer.parseInt(s[0]);
            String command = s[1];

            int len = ti - lastSec; // 현재 시간 - 직전 command = 거리

            int xi = dir[currentDir][0] * len;  // 거리와 방향
            int yi = dir[currentDir][1] * len;
            pos[0] += xi;                       // 방향에 맞춰 거리만큼 이동
            pos[1] += yi;

            if (command.equals("right")) {      // 방향 바꾸기
                currentDir = (currentDir + 1) % 4;
            } else {
                currentDir = (currentDir + 3) % 4;
            }

            lastSec = ti;
        }

        t -= lastSec;
        pos[0] += dir[currentDir][0] * t;
        pos[1] += dir[currentDir][1] * t;

        System.out.println(pos[0] + " " + pos[1]);
    }
}