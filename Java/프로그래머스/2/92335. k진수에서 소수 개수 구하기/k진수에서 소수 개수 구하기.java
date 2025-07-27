class Solution {    
    public int solution(int n, int k) {
        String str = Integer.toString(n, k);
        
        String[] nums = str.split("0");
        
        int answer = 0;
        for(String num: nums){
            if(num.equals("")) continue;
            if(isPrime(Long.parseLong(num)))
                answer++;
        }
        return answer;
    }
    
    private boolean isPrime(long x) {
        if (x < 2) return false;
        if (x % 2 == 0) return x == 2;
        
        for(long i = 3; i*i <= x; i+= 2)
            if (x % i == 0) return false;
        
        return true;
    }
}