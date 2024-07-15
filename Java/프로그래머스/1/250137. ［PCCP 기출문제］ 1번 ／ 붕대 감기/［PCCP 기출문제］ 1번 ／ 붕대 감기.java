import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int combo = 0;
        int len = attacks.length;
        int cur = 0;
        int max = health;
        
        for(int i = attacks[0][0]; i <= attacks[len-1][0]; i++){
            if(i == attacks[cur][0]){
                health -= attacks[cur][1];
                if(health <= 0){
                    return -1;
                }
                combo = 0;
                cur++;
                continue;
            }
            
            health += bandage[1];
            combo++;
            
            if(combo >= bandage[0]){
                health += bandage[2];
                combo = 0;
            }

            if(health > max){
                health = max;
            }
        }
        
        return health;
    }
}