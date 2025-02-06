import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        String[] token = s.split("},\\{");
        
        Map<String, Integer> counter = new HashMap<>();
        for(String t: token){
            String[] nums = t.split(",");
            for(String n: nums){
                counter.put(n, counter.getOrDefault(n, 0)+1);
            }
        }
        
        return counter.entrySet()
            .stream()
            .sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
            .mapToInt(entry -> Integer.parseInt(entry.getKey()))
            .toArray();
    }
}