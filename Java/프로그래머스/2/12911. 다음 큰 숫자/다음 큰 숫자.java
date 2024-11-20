class Solution {
    public int solution(int n) {
        int target = numberOfOne(n);
        for(int i = n+1; i <= 1_000_000; i++){
            if(numberOfOne(i) == target){
                return i;
            }
        }
        return -1;
    }
    
    private int numberOfOne(int n){
        int count = 0;
        while(n > 0){
            if(n % 2 == 1){
                count++;
            }
            n /= 2;
        }
        return count;
    }
}