import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for(String[] c: clothes){
            map.put(c[1], map.getOrDefault(c[1], 0) + 1);
        }
        
        int[] nums = map.values().stream()
            .mapToInt(i->i).toArray();
        
        int comb = 1;
        
        for(int n: nums){
            comb *= (n + 1);
        }
        
        return comb-1;
    }
}