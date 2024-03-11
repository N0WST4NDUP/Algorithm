import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[targets.length];
        for (String key : keymap) {
            for (int j=0; j<key.length(); j++) {
                map.put(key.charAt(j),(map.containsKey(key.charAt(j)) ? 
                         (map.get(key.charAt(j))) > j ? j : map.get(key.charAt(j))
                          : j));
            }
        }

        for (int i=0; i<targets.length; i++) {
            for (int j=0; j<targets[i].length(); j++) {
                if (!map.containsKey(targets[i].charAt(j))) {
                    answer[i] = -1; break;
                }
                answer[i] += map.get(targets[i].charAt(j))+1;
            }
        }
        
        return answer;
    }
}