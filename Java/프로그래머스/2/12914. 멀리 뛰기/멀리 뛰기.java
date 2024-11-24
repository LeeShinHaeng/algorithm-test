class Solution {
    public long solution(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 1;
        ans[1] = 1;
        
        for(int i = 2; i <= n; i++){
            ans[i] =(ans[i-1] + ans[i-2]) % 1234567;
        }
        return ans[n];
    }
}