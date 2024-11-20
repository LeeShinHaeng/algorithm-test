import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        // 가벼운 사람
        int left = 0;
        // 무거운 사람
        int right = people.length - 1;
        int answer = 0;
        
        while(left <= right){
            // 같이 탈 수 있으면 같이 타고, 아니면 무거운 사람만 탄다
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
            answer++;
        }
        return answer;
    }
}