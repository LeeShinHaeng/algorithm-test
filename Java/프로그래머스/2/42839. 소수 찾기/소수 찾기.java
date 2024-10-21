import java.util.*;

class Solution {
    public int solution(String numbers) {    
        Set<Integer> numberSet = new HashSet<>();
        
        storeCombi("", numbers, numberSet);
        
        int answer = 0;
        for(int number: numberSet){
            if(isPrime(number)){
                answer++;
            }
        }
        
        return answer;
    }
    
    // set에 숫자 조합을 저장
    private void storeCombi(String prefix, String str, Set<Integer> numberSet){
        int n = str.length();
        
        if(! prefix.equals("")){
            numberSet.add(Integer.parseInt(prefix));
        }
        
        for(int i = 0; i < n; i++){
            storeCombi(prefix+str.charAt(i), str.substring(0, i) + str.substring(i+1, n) , numberSet);
        }
    }
    
    // 소수인지 판별
    private boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    
}