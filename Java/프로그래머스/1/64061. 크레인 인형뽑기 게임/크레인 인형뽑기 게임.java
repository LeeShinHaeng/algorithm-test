import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int row = board.length;
        int col = board[0].length;
        Stack<Integer> stack = new Stack<>();
        
        for(int m: moves){
            for(int i = 0; i < row; i++){
                int cur = board[i][m-1];
                if(cur == 0) continue;
                
                if(! stack.isEmpty() && stack.peek() == cur){
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(cur);
                }
                
                board[i][m-1] = 0;
                break;
            }
        }
        
        return answer;
    }
}