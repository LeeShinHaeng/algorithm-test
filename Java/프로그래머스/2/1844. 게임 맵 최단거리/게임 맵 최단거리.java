import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int rows = maps.length;
        int cols = maps[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0, 0, 1});
        visited[0][0] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int depth = current[2];

            if (x == rows - 1 && y == cols - 1) {
                return depth;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx >= 0 && nx < rows && 
                    ny >= 0 && ny < cols && 
                    maps[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.offer(new int[] {nx, ny, depth + 1});
                }
            }
        }

        return -1;
    }
}