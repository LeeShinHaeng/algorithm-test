class Solution {
    public int solution(int a, int b) {
        String as = String.valueOf(a);
        String bs = String.valueOf(b);
        
        int x = Integer.parseInt(as + bs);
        int y = Integer.parseInt(bs + as);
        
        int answer = x > y ? x : y;
        return answer;
    }
}