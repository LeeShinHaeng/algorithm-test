import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> filtered = extract(data, ext, val_ext);
        
        int key = 0;
        char c = sort_by.charAt(0);
        switch(c){
            case 'c':
                key = 0;
                break;
            case 'd':
                key = 1;
                break;
            case 'm':
                key = 2;
                break;
            case 'r':
                key = 3;
                break;
        }
        final int k = key;
        
        Collections.sort(filtered, (o1, o2) -> {
            return o1[k] - o2[k];
        });
        
        int[][] answer = new int[filtered.size()][4];
        for(int i = 0; i < filtered.size(); i++){
            answer[i][0] = filtered.get(i)[0];
            answer[i][1] = filtered.get(i)[1];
            answer[i][2] = filtered.get(i)[2];
            answer[i][3] = filtered.get(i)[3];
        }
        return answer;
    }
    
    public ArrayList<int[]> extract(int[][] data, String ext, int value){
        int key = 0;
        char c = ext.charAt(0);
        switch(c){
            case 'c':
                key = 0;
                break;
            case 'd':
                key = 1;
                break;
            case 'm':
                key = 2;
                break;
            case 'r':
                key = 3;
                break;
        }
        
        ArrayList<int[]> result = new ArrayList<>();
        
        for(int[] d: data){
            if(d[key] >= value) continue;
            result.add(d);
        }
        
        return result;
    }
    
}