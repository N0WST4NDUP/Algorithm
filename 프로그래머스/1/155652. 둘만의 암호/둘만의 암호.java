import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        List<Character> list = new ArrayList<>();
        int n = 97;
        
        while (n <= 122) {
            if (skip.contains(String.valueOf((char)n))) {n++; continue;}
            list.add((char)n++);
        }
        
        for (char c : s.toCharArray()) {
            int idx = list.indexOf(c)+index;
            if (idx >= list.size()) idx %= list.size();
            answer.append(list.get(idx));
        }
        
        return answer.toString();
    }
}