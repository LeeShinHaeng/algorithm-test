import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int len = score.length;
        int[] answer = new int[len];
        ArrayList<Integer> hall = new ArrayList<>();
        
        for(int i = 0; i < len; i++){
            hall.add(score[i]);
            hall.sort(Collections.reverseOrder());
            
            if(hall.size() < k){
                answer[i] = hall.get(hall.size() - 1);
            } else {
                answer[i] = hall.get(k-1);
            }
        }
        
        return answer;
    }
}