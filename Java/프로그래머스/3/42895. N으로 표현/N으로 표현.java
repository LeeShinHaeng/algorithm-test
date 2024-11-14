import java.util.*;

class Solution {
    public int solution(int N, int number) {
        if(N == number)
            return 1;
        
        List<Set<Integer>> list = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            list.add(new HashSet<>());
        }
        
        int base = N;
        for(int i = 1; i < 9; i++){
            list.get(i).add(base);
            base = base * 10 + N;   // N, NN, NNN, ...
        }
        
        for(int i = 1; i < 9; i++){ // N을 i번 사용하는 경우
            for(int j = 1; j < i; j++){ // N을 j번 사용한 결과와 i-j번 사용한 결과를 조합
                for(Integer a: list.get(j)){
                    for(Integer b: list.get(i - j)){
                        list.get(i).add(a+b);
                        list.get(i).add(a-b);
                        list.get(i).add(a*b);
                        if(b != 0) 
                            list.get(i).add(a/b);
                    }
                }
            } // end of j
            if(list.get(i).contains(number))
                return i;
        } // end of i
        return -1;
    }
}