import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] sCounts = new int[N + 2]; 

        for (int stage : stages) {
            sCounts[stage]++;
        }

        int totalPlayers = stages.length; 
        List<double[]> stageFailure = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                stageFailure.add(new double[]{i, 0.0});
            } else {
                double failureRate = (double) sCounts[i] / totalPlayers;
                stageFailure.add(new double[]{i, failureRate});
                totalPlayers -= sCounts[i]; 
            }
        }

        stageFailure.sort((a, b) -> {
            if (b[1] != a[1]) {
                return Double.compare(b[1], a[1]);
            } else {
                return Double.compare(a[0], b[0]);
            }
        });

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = (int) stageFailure.get(i)[0];
        }

        return answer;
    }
}
