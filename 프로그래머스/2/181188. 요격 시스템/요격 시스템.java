import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        Arrays.sort(targets, (o1,o2) -> {return o1[1] - o2[1];});
        int missile = 0;
        for (int[] target : targets) {
            if (missile == 0) {
                missile = target[1];
                answer++;
            }
            
            if (target[0]<missile && missile<=target[1]) continue;
            
            missile = target[1];
            answer++;
        }
        return answer;  
    }
}