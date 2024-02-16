import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> rank1 = new HashMap<String, Integer>();
		HashMap<Integer, String> rank2 = new HashMap<Integer, String>();
		
		for (int i=0; i<players.length; i++) {
			rank1.put(players[i], i);
			rank2.put(i, players[i]);
		}
		
		for (String name : callings) {
			String pref = rank2.get(rank1.get(name)-1);
			
			rank1.put(name, rank1.get(name)-1);
			rank1.put(pref, rank1.get(pref)+1);
			
			rank2.put(rank1.get(name), name);
			rank2.put(rank1.get(pref), pref);
		}
        
		for (int i=0; i<players.length; i++) {
			players[i] = rank2.get(i);
		}
		
        return players;
    }
}