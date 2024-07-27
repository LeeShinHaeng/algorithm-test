import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> alphabets = new HashMap<>();
        
        for(int i = 0; i < 26; i++){
            alphabets.put((char)(65+i), Integer.MAX_VALUE);
        }
        
        for(String key : keymap){
            for(int i = 0; i < key.length(); i++){
                if(alphabets.get(key.charAt(i)) > (i+1)){
                    alphabets.put(key.charAt(i), i+1);
                }
            }
        }
        
        int sum = 0;
        int k = 0;
        for(String target : targets){
            for(int i = 0; i < target.length(); i++){
                if(alphabets.get(target.charAt(i)) == Integer.MAX_VALUE){
                    sum = -1;
                    break;
                }
                sum += alphabets.get(target.charAt(i));
            }
            answer[k++] = sum;
            sum = 0;
        }
        
        return answer;
    }
}