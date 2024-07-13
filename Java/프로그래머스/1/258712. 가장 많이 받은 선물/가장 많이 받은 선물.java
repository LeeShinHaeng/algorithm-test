import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int len = friends.length;
        int[][] table = new int[len][len];
        int[] points = new int[len];
        int[] nextMonth = new int[len];
        
        for(String gift : gifts){
            StringTokenizer st = new StringTokenizer(gift);
            
            String from = st.nextToken();
            String to = st.nextToken();
            int row = 0;
            int col = 0;
            
            for(int i = 0; i < len; i++){
                if(friends[i].equals(from)){
                    row = i;
                    points[i]++;
                } else if(friends[i].equals(to)){
                    col = i;
                    points[i]--;
                }
            }
            table[row][col]++;
        }
        
        for(int i =0; i < len; i++){
            for(int j = 0; j < i; j++){
                if(table[i][j] > table[j][i]){
                    nextMonth[i]++;
                } else if(table[i][j] < table[j][i]){
                    nextMonth[j]++;
                } else {
                    if(points[i] > points[j]){
                        nextMonth[i]++;
                    } else if(points[i] < points[j]){
                        nextMonth[j]++;
                    } 
                }
            }
        }
        Arrays.sort(nextMonth);
        return nextMonth[len-1];
    }
}