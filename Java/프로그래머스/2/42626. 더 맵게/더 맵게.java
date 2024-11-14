import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        Queue<Integer> list = new PriorityQueue<>();
        for(int s: scoville){
            list.offer(s);
        }
        
        int answer = 0;
        while(list.size() >= 2 && list.peek() < K){
            int n1 = list.poll();
            int n2 = list.poll();
            int n3 = n1 + (n2 * 2);
            list.offer(n3);
            answer++;
        }
        
        if(list.peek() < K){
            return -1;
        }
        
        return answer;
    }
}