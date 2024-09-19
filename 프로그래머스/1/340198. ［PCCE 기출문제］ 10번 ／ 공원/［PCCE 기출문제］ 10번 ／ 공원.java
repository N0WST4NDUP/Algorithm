import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int[][] dp = new int[park.length][park[0].length];
        Set<Integer> numSet = new HashSet<>();
        
        for (int i=0; i<park.length; i++) {
            for (int j=0; j<park[i].length; j++) {
                if (park[i][j].equals("-1")) dp[i][j]++;
            }
        }
        
        for (int i=1; i<dp.length; i++) {
            for (int j=1; j<dp[i].length; j++) {
                if (dp[i][j] == 0) continue;
                
                dp[i][j] = 1 + Math.min(dp[i-1][j-1], 
                                        Math.min(dp[i][j-1], 
                                                 dp[i-1][j]));
                numSet.add(dp[i][j]);
            }
        }
        
        int answer = -1;
        for (int mat : mats) {
            if (numSet.contains(mat)) answer = Math.max(answer, mat);
        }
        
        return answer;
    }
}