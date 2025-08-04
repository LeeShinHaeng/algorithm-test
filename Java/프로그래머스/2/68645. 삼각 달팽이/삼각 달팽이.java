class Solution {
    public int[] solution(int n) {
        int[][] table = new int[n][n];
        
        int num = 1, x = -1, y = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(i % 3 == 0) x++;
                else if(i % 3 == 1) y++;
                else {
                    x--;
                    y--;
                }
                table[x][y] = num++;
            }
        }
        
        int[] answer = new int[(n * (n+1)) / 2];
        int index = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(table[i][j] == 0) break;
                answer[index++] = table[i][j];
            }
        }
        return answer;
    }
}