import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        int num = 1;
        for(int i = 0; i < order.length; i++){
            for(int j = num; j < order[i]; j++){
                stack.push(j);
                num++;
            }
            
            if(num == order[i]){
                num++;
                answer++;
                continue;
            }
            
            if(! stack.isEmpty() && stack.peek() == order[i]){
                stack.pop();
                answer++;
                continue;
            }
            
            break;
        }
        
        return answer;
    }
}