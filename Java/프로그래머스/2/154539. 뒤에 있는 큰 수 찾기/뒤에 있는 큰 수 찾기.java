import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int len = numbers.length;
        int[] answer = new int[len];
        Arrays.fill(answer, -1);
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int i = len-1; i >= 0; i--){
            while (!stack.empty()){
                if(numbers[i] >= stack.peek()){
                    stack.pop();
                } else {
                    break;
                }
            }
            
            if(!stack.empty()){
                answer[i] = stack.peek();
            }

            stack.push(numbers[i]);
        }
        
        return answer;
    }
}