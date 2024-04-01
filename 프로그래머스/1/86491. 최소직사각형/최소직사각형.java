import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int min = 0;
        int max = 0;
        
        for (int i=0; i<sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }
        
        for (int i=0; i<sizes.length; i++) {
            min = Math.max(min,sizes[i][0]);
            max = Math.max(max,sizes[i][1]);
        }
        return max*min;
    }
}