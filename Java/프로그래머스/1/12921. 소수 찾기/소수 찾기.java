import java.util.*;

class Solution {
    static boolean[] isPrime;
    public int solution(int n) {
        isPrime = new boolean[n + 1];
        initIsPrime();
        return countPrime();
    }
    
    private static void initIsPrime(){
        Arrays.fill(isPrime, true);
        
        int len = isPrime.length;        
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2; i <= Math.sqrt(len); i++){
            if(isPrime[i]){
                for(int j = i * i; j < len; j += i){
                    isPrime[j] = false;
                }
            }
        }
    }
    
    private static int countPrime(){
        int count = 0;
        for(int i = 2; i < isPrime.length; i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }
}