class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE, luy = Integer.MAX_VALUE, rdx = 0, rdy = 0;
        int i = 0;
        for(String line : wallpaper){
            for(int j = 0; j < line.length(); j++){
                if(line.charAt(j) == '#'){
                    if(i < lux) lux = i;
                    if(i > rdx) rdx = i;
                    if(j < luy) luy = j;
                    if(j > rdy) rdy = j;
                }
            }
            i++;
        }
        
        return new int[]{lux, luy, rdx+1, rdy+1};
    }
}