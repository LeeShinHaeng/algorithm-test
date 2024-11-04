import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        String[] cannot = {"ayaaya", "yeye", "woowoo", "mama"};
        int count = 0;
        
        for(String b: babbling){
            boolean flag = false;
            for(String c: cannot){
                if(b.contains(c)){
                    flag = true;
                }
            }
            
            if(flag) continue;
            
            String tmp = b;
            for(String w: words){
                tmp = tmp.replace(w, " ");
            }
            tmp = tmp.replace(" ", "");
            if(tmp.isEmpty()){
                count++;
                System.out.println(b);
            }
        }
        
        return count;
    }
}