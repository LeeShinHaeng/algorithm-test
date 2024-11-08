import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        ArrayList<Integer> answer = new ArrayList<>();
        
        int[] days = new int[n];
        for (int i = 0; i < n; i++) {
            days[i] = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        
        int maxDay = days[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (days[i] <= maxDay) {
                count++;
            } else {
                answer.add(count);
                count = 1; 
                maxDay = days[i];
            }
        }
        answer.add(count);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
