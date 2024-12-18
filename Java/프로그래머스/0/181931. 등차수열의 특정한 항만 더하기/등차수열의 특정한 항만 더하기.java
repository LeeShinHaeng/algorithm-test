class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        for(boolean i: included){
            if(i){
                sum += a;
            }
            a += d;
        }
        return sum;
    }
}