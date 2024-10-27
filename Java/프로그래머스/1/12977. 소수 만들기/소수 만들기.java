import java.util.*;
class Solution {
    static boolean[] isPrime;
    
    public int solution(int[] nums) {
        int len = nums.length;
        isPrime = new boolean[3000];
        initPrime();
        int sum = 0, count = 0;
        for(int i = 0; i < len-2; i++){
            for(int j = i+1; j < len-1; j++){
                for(int k = j+1; k < len; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if(isPrime[sum]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
    public void initPrime(){
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2; i < Math.sqrt(isPrime.length); i++){
            if(isPrime[i]){
                for(int j = i * i; j < isPrime.length; j += i){
                    isPrime[j] = false;
                }
            }
        }
    }
}