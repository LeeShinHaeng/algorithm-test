import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        Arrays.sort(num_list);
        
        int[] answer = new int[len-5];
        int j = 0;
        for(int i = 5; i < len; i++){
            answer[j++] = num_list[i];
        }
        return answer;
    }
}