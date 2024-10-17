import java.util.*;

class Solution {
    static String[][] map;
    static int r;
    static int c;
    
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        
        map = park;
        r = park.length;
        c = park[0].length;
        
        int max = -1;
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(park[i][j].equals("-1")){
                    for (int k = 0; k < mats.length; k++) {
                        if (calculate(i, j, mats[k])) {
                            max = Math.max(max, mats[k]);
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        
        return max; 
    }
    
    public boolean calculate(int x, int y, int size) {
        if (x + size > r || y + size > c) {
            return false;
        }
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!map[x + i][y + j].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}
