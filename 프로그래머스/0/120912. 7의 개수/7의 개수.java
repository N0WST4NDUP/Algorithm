import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String s = Arrays.toString(array);
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '7') answer++;
        }
        return answer;
    }
}