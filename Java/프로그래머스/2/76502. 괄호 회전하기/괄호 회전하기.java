import java.util.*;

class Solution {
    public int solution(String s) {
        int len = s.length();
        int answer = 0;
        
        for(int i = 0; i < len; i++){
            // 검사
            if(isValid(s))
                answer++;
            
            // 회전
            s = s.substring(1, len) +s.substring(0, 1);
        }
        return answer;
    }
    
    public boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '[' || c == '{' || c == '('){
                st.push(c);
            }
            if(c == ']'){
                if(st.isEmpty() || st.pop() != '[')
                    return false;
                
            }    
            if(c == '}'){
                if(st.isEmpty() || st.pop() != '{')
                    return false;
                
                    
            }   
            if(c == ')'){
                if(st.isEmpty() || st.pop() != '(')
                    return false;
            }
        }
        if(! st.isEmpty())
            return false;
        
        return true;
    }
}