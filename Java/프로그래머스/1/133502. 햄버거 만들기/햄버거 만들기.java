import java.util.*;

class Solution {
    ArrayDeque<Integer> stack = new ArrayDeque<>();
    public int solution(int[] ingredient) {
        int answer = 0;
        
        for(int i: ingredient){
            stack.push(i);
            if(check()) answer++;
        }
        
        return answer;
    }
    
    public boolean check(){
        if(stack.size() < 4) return false;
        
        int a = stack.pop();
        if(a != 1) {
            stack.push(a);
            return false;
        }
        
        int b = stack.pop();
        if(b != 3){
            stack.push(b);
            stack.push(a);
            return false;
        }
        
        int c = stack.pop();
        if(c != 2){
            stack.push(c);
            stack.push(b);
            stack.push(a);
            return false;
        }
        
        int d = stack.pop();
        if(d != 1){
            stack.push(d);
            stack.push(c);
            stack.push(b);
            stack.push(a);
            return false;
        }
        
        return true;
    }
}