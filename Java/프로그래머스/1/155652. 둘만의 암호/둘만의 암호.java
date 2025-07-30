import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> skipSet = new HashSet<>();
        for(int i = 0; i < skip.length(); i++)
            skipSet.add(skip.charAt(i));
        
        
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            for(int j = 0; j < index; j++){
                if(c == 'z') c = 'a';
                else c++;
                
                while(skipSet.contains(c)){
                    if(c == 'z') c = 'a';
                    else c++;
                }
            }
            answer.append(c);
        }
        
        return answer.toString();
    }
}