class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int v = change(video_len);
        int p = change(pos);
        int s = change(op_start);
        int e = change(op_end);    
        
        for(String c: commands){
            if(p >= s && p <= e){
                p = e;
            }
            if(c.equals("prev")){
                p -= 10;
                if(p < 0){
                    p = 0;
                }
                if(p % 100 >= 60){
                    p -= 40;
                }
            } else if(c.equals("next")){
                p += 10;
                if(p % 100 >= 60){
                    p += 100;
                    p -= 60;
                }
                if(p > v){
                    p = v;
                }
            } 
            if(p >= s && p <= e){
                p = e;
            }
        }
        int min = p/100;
        String minString = ""+min;
        if(min < 10){
            minString = "0" + min;
            if(min == 0){
                minString = "00";
            }
        }
        
        int sec = p%100;
        String secString = ""+sec;
        if(sec < 10){
            secString = "0" + sec;
            if(sec == 0){
                secString = "00";
            }
        }
        
        String answer = minString + ":" + secString;
        return answer;
    }
    
    public int change(String input){
        String[] token = input.split(":");
        return Integer.parseInt(token[0])*100 + Integer.parseInt(token[1]);
    }
}