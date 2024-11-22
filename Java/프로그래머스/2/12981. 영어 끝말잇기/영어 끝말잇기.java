import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 1; i <= n; i++)
            map.put(i, 0);
        
        set.add(words[0]);
        map.put(1, 1);
        
        for(int i = 1; i < words.length; i++){
            String word = words[i];
            String last = words[i-1];
            int cur = i % n + 1;
            if(set.contains(word) || 
               word.length() == 1 ||
               last.charAt(last.length()-1) != word.charAt(0)){
                return new int[]{cur, map.get(cur) + 1};
            }
            map.put(cur, map.get(cur) + 1);
            set.add(word);
        }
        
        return new int[]{0, 0};
    }
}