class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[][] moves = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };
        int h = park.length;
        int w = park[0].length();
        int[] location = {0, 0};
        int[] now = {0, 0};
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                char tmp = park[i].charAt(j);
                if(tmp == 'S'){
                    now[0] = i;
                    now[1] = j;
                    break;
                }
            }
        }
        location[0] = now[0];
        location[1] = now[1];
        
        int dirNum = 0;
        int distance = 0;
        for(String route : routes){
            String[] str = route.split(" ");
            char dir = str[0].charAt(0);
            distance = Integer.parseInt(str[1]);
            switch(dir){
                case 'N' :
                    dirNum = 0;
                    break;
                case 'S' :
                    dirNum = 1;
                    break;
                case 'W' :
                    dirNum = 2;
                    break;
                case 'E' :
                    dirNum = 3;
            }
            int i = 0;
            for(i = 0; i < distance; i++){
                now[0] += moves[dirNum][0];
                now[1] += moves[dirNum][1];
                if(now[0] < 0 || now[0] >= h ||
                    now[1] < 0 || now[1] >= w || 
                    park[now[0]].charAt(now[1]) == 'X'){
                    break;
                }
            }
            if(i == distance){
                location[0] = now[0];
                location[1] = now[1];
            } else {
                now[0] = location[0];
                now[1] = location[1];
            }
            
        }
        return location;
    }
}