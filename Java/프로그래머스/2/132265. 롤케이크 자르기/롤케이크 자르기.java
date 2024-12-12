import java.util.*;

class Solution {
    public int solution(int[] topping) {
        Set<Integer> setLeft = new HashSet<>();
        Map<Integer, Integer> mapRight = new HashMap<>();
        
        for(int t: topping){
            mapRight.put(t, mapRight.getOrDefault(t, 0) + 1);
        }
        
        int answer = 0;
        
        for(int t: topping){
            setLeft.add(t);
            
            mapRight.put(t, mapRight.get(t) - 1);
            if(mapRight.get(t) == 0){
                mapRight.remove(t);
            }
            
            if(setLeft.size() == mapRight.size()){
                answer++;
            }
        }
        
        return answer;
    }
}