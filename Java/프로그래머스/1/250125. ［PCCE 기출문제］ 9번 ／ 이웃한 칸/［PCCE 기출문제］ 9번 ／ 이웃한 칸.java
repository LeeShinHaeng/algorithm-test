class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        int len = board.length;
        String target = board[h][w];
        if(h > 0 && target.equals(board[h-1][w])){
            answer++;
        }
        if(h < len-1 && target.equals(board[h+1][w])){
            answer++;
        }
        if(w > 0 && target.equals(board[h][w-1])){
            answer++;
        }
        if(w < len-1 && target.equals(board[h][w+1])){
            answer++;
        }
        
        
        return answer;
    }
}