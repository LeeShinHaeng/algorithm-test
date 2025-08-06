import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // {무게, 올라온 시간}
        ArrayDeque<int[]> on = new ArrayDeque<>();
        ArrayDeque<Integer> waitQ = new ArrayDeque<>();
        
        int len = truck_weights.length;
        for(int i = 0; i < len; i++){
            waitQ.add(truck_weights[i]);
        }
        
        // 다리위 트럭의 무게 합, 최단 시간, 지난 트럭의 수
        int sum = 0, time = 1, done = 0;
        
        while(done < len){
            time++;
            // 대기 트럭이 있으면 
            if(waitQ.size() > 0){
                // 다리에 올라갈 수 있으면
                if(sum + waitQ.peek() <= weight && on.size() < bridge_length){
                    int cur = waitQ.poll();
                    on.add(new int[]{cur, 0});
                    sum += cur;
                }
            }
            // 올라온 시간을 추가
            for(int[] o: on) o[1]++;
            
            // 맨 앞 트럭이 지나가면
            if(on.peek()[1] >= bridge_length){
                sum -= on.poll()[0];
                done++;
            }
        }
        
        return time;
    }
}