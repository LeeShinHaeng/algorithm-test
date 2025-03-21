class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        
        // 진법 변환
        int i = 0;
        while (sb.length() < (t - 1) * m + p) {
            sb.append(Integer.toString(i, n).toUpperCase());
            i++;
        }
        
        // m 중 p번째 파싱
        StringBuilder answer = new StringBuilder();
        for (int j = p - 1; answer.length() < t; j += m) {
            answer.append(sb.charAt(j));
        }
        
        return answer.toString();
    }
}