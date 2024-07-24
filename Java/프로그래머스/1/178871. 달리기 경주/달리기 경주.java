import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> playerKey = new HashMap<>();
        HashMap<Integer, String> rankKey = new HashMap<>();
        for(int i = 0; i < players.length; i++){
            playerKey.put(players[i], i);
            rankKey.put(i, players[i]);
        }
        
        for(String calling: callings){
            int rank = playerKey.get(calling);
            String player = rankKey.get(rank);
            String front = rankKey.get(rank-1);
            
            playerKey.put(player, rank-1);
            playerKey.put(front, rank);
            rankKey.put(rank-1, player);
            rankKey.put(rank, front);
        }
        
        String[] answer = new String[players.length];
        for(int i = 0; i < players.length; i++){
            answer[i] = rankKey.get(i);
        }
        
        return answer;
    }
}