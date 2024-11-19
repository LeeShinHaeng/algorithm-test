import java.util.*;

class Solution {
    public int solution(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        
        Arrays.sort(arr);
        int tmp = 1;
        for(int i = 0; i < arr.length; i++){
            tmp = lcm(tmp, arr[i]);
        }
        
        return tmp;
    }
    
    public int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
    
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}