import java.util.*;

class Solution {
    public int solution(String word) {
        int answer = 0;
        char[] moeum = {'A', 'E', 'I', 'O', 'U'};
        int[] weight = new int[5];
        
        for(int i = 4; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                weight[4-i] += (int) Math.pow(5, j);
            }
        }
        
        for(int i = 0; i < word.length(); i++){
            int index = findIndex(moeum, word.charAt(i));
            
            answer += weight[i] * index + 1;
        }
        
        return answer;
    }
    
    public int findIndex(char[] moeum, char c){
        for(int i = 0; i < moeum.length; i++){
            if(moeum[i] == c)
                return i;
        }
        return -1;
    }
}