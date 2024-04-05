import java.util.*;

class Solution {
    public List<Integer> solution(int start, int end_num) {
        List<Integer> answer = new ArrayList<>();
        while (start>=end_num) answer.add(start--);
        return answer;
    }
}