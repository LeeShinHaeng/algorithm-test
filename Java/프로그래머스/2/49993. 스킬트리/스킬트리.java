import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        List<Character> skillList = new ArrayList<>();
        for (char c : skill.toCharArray()) {
            skillList.add(c);
        }
        
        for (String tree : skill_trees) {
            int idx = 0;
            boolean flag = true;
            for (char c : tree.toCharArray()) {
                if (skillList.contains(c)) {
                    if (c != skillList.get(idx)) {
                        flag = false;
                        break;
                    }
                    
                    idx++;
                    if(idx == skillList.size()) break;
                }
            }
            if (flag) answer++;
        }
        return answer;
    }
}
