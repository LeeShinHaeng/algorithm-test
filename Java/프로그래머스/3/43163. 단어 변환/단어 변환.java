import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Set<Tree> treeSet = new HashSet<>();
        
        for(String w: words){
            treeSet.add(new Tree(w));
        }
        
        for(Tree t1: treeSet){
            for(Tree t2: treeSet){
                if(t1.equals(t2))
                    continue;
                t1.check(t2);
            }
        }
        
        Tree beginTree = new Tree(begin);
        
        for(Tree t: treeSet){
            beginTree.check(t);
        }
        
        int answer = bfs(beginTree, target);
        return answer;
    }
    
    public int bfs(Tree root, String target){
        Queue<Tree> queue = new LinkedList<>();
        Map<String, Integer> depth = new HashMap<>(); 
        
        queue.offer(root);
        depth.put(root.getWord(), 0);
        
        while (!queue.isEmpty()) {
            Tree current = queue.poll();
            String currentWord = current.getWord();
            int currentDepth = depth.get(currentWord);
            
            if (currentWord.equals(target)) {
                return currentDepth;
            }
            
            for (Tree neighbor : current.getTrees()) {
                if (!neighbor.visited) {
                    neighbor.visited = true;
                    queue.offer(neighbor);
                    depth.put(neighbor.getWord(), currentDepth + 1);
                }
            }
        }
        
        return 0;
    }
}

class Tree {
    private String word;
    private Set<Tree> trees;
    public boolean visited;
    
    public Tree(String word){
        this.word = word;
        trees = new HashSet<>();
        visited = false;
    }

    public String getWord(){
        return this.word;
    }
    
    public Set<Tree> getTrees(){
        return this.trees;
    }
    
    public void check(Tree treeInput){
        String input = treeInput.getWord();
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != word.charAt(i)){
                count++;
            }
            if(count > 1){
                return;
            }
        }
        
        if(count == 1)
            trees.add(treeInput);
    }
}