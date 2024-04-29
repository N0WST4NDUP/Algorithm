import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] x = new int[201];
        for (int[] line : lines) {
            for (int i=line[0]+100; i<line[1]+100; i++) {
                x[i]++;
            }
        }
        for (int dot : x) {
            if (dot > 1) answer++;
        }
        return answer;
    }
}