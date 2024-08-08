import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> chulsu = new HashMap<>();
        for (int num : topping) {
            chulsu.put(num, chulsu.getOrDefault(num, 0) + 1);
        }
        
        Set<Integer> brother = new HashSet<>();
        for (int i=topping.length-1; i>=0; i--) {
            if (chulsu.get(topping[i]) <= 1) chulsu.remove(topping[i]);
            else chulsu.put(topping[i], chulsu.get(topping[i])-1);
            
            brother.add(topping[i]);
            
            if (chulsu.keySet().size() == brother.size()) answer++;
        }
        
        return answer;
    }
}