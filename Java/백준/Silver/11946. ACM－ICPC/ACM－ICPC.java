import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]); // 참가 팀 수
        int m = Integer.parseInt(s[1]); // 문제 수
        int q = Integer.parseInt(s[2]); // 채점 로그 수

        int[][] penaltyPerQuestion = new int[n + 1][m + 1];
        int[] timePerTeam = new int[n + 1];
        int[] countAccept = new int[n + 1];
        boolean[][] solved = new boolean[n + 1][m + 1];

        for (int i = 0; i < q; i++) {
            s = br.readLine().split(" ");
            int time = Integer.parseInt(s[0]);
            int team = Integer.parseInt(s[1]);
            int question = Integer.parseInt(s[2]);
            if (s[3].charAt(0) == 'A') {
                if (!solved[team][question]) {
                    timePerTeam[team] += time;
                    timePerTeam[team] += penaltyPerQuestion[team][question] * 20;
                    countAccept[team]++;
                    solved[team][question] = true;
                }
            } else {
                if (!solved[team][question]) {
                    penaltyPerQuestion[team][question]++;
                }
            }
        }

        int[][] result = new int[n][3];
        for (int i = 1; i < n + 1; i++) {
            result[i - 1][0] = i;
            result[i - 1][1] = countAccept[i];
            result[i - 1][2] = timePerTeam[i];
        }

        Arrays.sort(result, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(b[1], a[1]);
            }
            if (a[2] != b[2]) {
                return Integer.compare(a[2], b[2]);
            }
            return Integer.compare(a[0], b[0]);
        });

        StringBuilder sb = new StringBuilder();
        for (int[] r : result) {
            sb.append(r[0]).append(" ").append(r[1]).append(" ").append(r[2]).append("\n");
        }
        System.out.println(sb);
    }
}