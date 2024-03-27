import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        List<Character> list = new ArrayList<>();
        int n = 97;
        
        for (int i=0; i<26; i++) {
            if (skip.contains(String.valueOf((char)(i + n)))) continue;
            list.add((char)(i+n));
        }
        
        for (char c : s.toCharArray()) {
            int idx = list.indexOf(c)+index;
            if (idx >= list.size()) idx %= list.size();
            answer.append(list.get(idx));
        }
        
        return answer.toString();
    }
}