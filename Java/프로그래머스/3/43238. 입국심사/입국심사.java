class Solution {
    public long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;
        long left = 1;  // 가능한 최소시간
        long right = 0; // 가능한 최대시간
        for(int time: times){
            right = Math.max(right, (long)time * n);
        }
        
        while(left <= right){
            long mid = (left + right) / 2;
            long sum = 0; // mid 시간 동안 심사할 수 있는 사람 수
            for(int time: times){
                sum += mid/time;
            }
            
            // sum >= n이면 범위를 왼쪽으로, sum < n이면 범위를 오른쪽으로
            if(sum >= n){
                right = mid-1;
                answer = Math.min(answer, mid);
            } else {
                left = mid+1;
            }
        }
        
        return answer;
    }
}