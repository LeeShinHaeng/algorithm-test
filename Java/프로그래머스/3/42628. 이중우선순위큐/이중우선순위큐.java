import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String op: operations){
            String[] s = op.split(" ");
            if(s[0].equals("I")){
                int tmp = Integer.parseInt(s[1]);
                pq.offer(tmp);
                maxpq.offer(tmp);
                continue;
            } 
            
            if(s[1].equals("1")){
                Integer max = maxpq.poll();
                pq.remove(max);
                continue;
            } 
            
            Integer min = pq.poll();
            maxpq.remove(min);
        }
        
        if(pq.isEmpty())
            return new int[]{0, 0};
        
        int[] answer = {maxpq.poll(), pq.poll()};
        return answer;
    }
}