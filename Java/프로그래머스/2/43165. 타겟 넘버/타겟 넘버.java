class Solution {
    static int[] nums;
    static int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        nums = numbers;
        int len = numbers.length;    
    
        dfs(0, len, 0, target);
        
        return answer;
    }
    
    public void dfs(int depth, int len, int sum, int target){
        if(depth == len){
            if(sum == target){
                answer++;
                return;
            }
            else {
                return;
            }
        }
        
        dfs(depth+1, len, sum + nums[depth], target);
        dfs(depth+1, len, sum - nums[depth], target);
    }
}