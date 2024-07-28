import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int win_count = 0;
        int zero_nums = 0;
        for(int i = 0; i < 6; i++){
            if(lottos[i] == 0){
                zero_nums++;
                continue;
            }
            
            for(int j = 0; j < 6; j++){
                if(lottos[i] == win_nums[j]){
                    win_count++;
                    break;
                }
            }
        }
        
        int low = 7 - win_count;
        if(low > 6){
            low = 6;
        }
        
        int high = low - zero_nums;
        if(high < 1){
            high = 1;
        }
        
        int[] answer = {high, low};        
        return answer;
    }
}