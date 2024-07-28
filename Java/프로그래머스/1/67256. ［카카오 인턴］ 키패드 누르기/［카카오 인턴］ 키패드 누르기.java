import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int curL = 10;
        int curR = 12;
        int disL = 0;
        int disR = 0;
        int i = 0;
        for(int n : numbers){
            i++;
            if(n == 0){
                n = 11;
            }
            if(n % 3 == 1){
                curL = n;
                sb.append("L");
                continue;
            }
            if(n % 3 == 0){
                curR = n;
                sb.append("R");
                continue;
            }
            disL = Math.abs(n - curL) / 3 + Math.abs(n - curL) % 3;
            disR = Math.abs(n - curR) / 3 + Math.abs(n - curR) % 3;
            
            if(disL < disR) {
                curL = n;
                sb.append("L");
                System.out.println(disL + ":" + disR +" = L < R" + n);
                continue;
            } 
            if(disL > disR) {
                curR = n;
                sb.append("R");
                System.out.println(disL + ":" + disR +" =  L > R" + n);
                continue;
            } 
            if(disL == disR) {
                if(hand.equals("left")){
                    curL = n;
                    sb.append("L");
                    System.out.println(i + " : equal - lefty" + n);
                } else {
                    curR = n;
                    sb.append("R");
                    System.out.println(i + " : equal - righty" + n);
                }
            } 
        }
        
        return sb.toString();
    }
}