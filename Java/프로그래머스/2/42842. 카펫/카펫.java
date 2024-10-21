class Solution {
    public int[] solution(int b, int y) {
        int total = b + y;
        
        for(int i = 1; i <= total; i++){
            if(total % i == 0){
                int j = total / i;
                
                if((i - 2)*(j - 2) == y){
                    return new int[] {j, i};
                }
            }
        } 
        return new int[] {0, 0};
    }
}