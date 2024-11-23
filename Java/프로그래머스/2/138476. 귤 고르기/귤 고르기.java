import java.util.*;

class Solution {
    public int solution(int k, int[] tan) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int t: tan){
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        List<Integer> keys = new ArrayList<>(map.keySet());
        
        keys.sort((o1, o2) -> {
            return map.get(o2) - map.get(o1);
        });
        
        int result = 0;
        for(Integer key: keys){
            k -=  map.get(key);
            result++;
            if(k <= 0){
                return result;
            }
        }
        
        
        return result;
    }
}