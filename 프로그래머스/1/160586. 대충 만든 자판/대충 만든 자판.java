import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<String, Integer> keyMap = new HashMap<>();
        
        for (int i=0; i<keymap.length; i++) {
            String[] splt = keymap[i].split("");
            for (int j=0; j<splt.length; j++) {
                keyMap.put(
                    splt[j], 
                    Math.min(j, keyMap.getOrDefault(splt[j], j))
                );
            }
        }
        
        int[] answer = new int[targets.length];
        
        for (int i=0; i<answer.length; i++) {
            for (String str : targets[i].split("")) {
                int count = keyMap.getOrDefault(str, -1);
                
                if (count == -1) {
                    answer[i] = count;
                    break;
                } else {
                    answer[i] += count+1;
                }
            }
        }
        
        return answer;
    }
}