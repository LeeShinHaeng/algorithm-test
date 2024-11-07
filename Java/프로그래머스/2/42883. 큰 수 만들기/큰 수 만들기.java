import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        
        for(int i = 0; i < number.length(); i++){
            char c = number.charAt(i);
            while(count < k && ! stack.isEmpty() && stack.peek() < c){
                stack.pop();
                count++;
            }
            stack.push(c);
        }
        
        while(!stack.isEmpty() && count < k){
            stack.pop();
            count++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}