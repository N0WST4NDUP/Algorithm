import java.util.Arrays;

class Solution {
    int[][] dp;
    public int solution(int[][] triangle) {
        int answer = 0;
        dp = triangle;
        return loopDP(triangle);
    }
    public int loopDP(int[][] arr) {
        for (int i=1; i<dp.length; i++) {
            dp[i][0] = arr[i][0] + dp[i-1][0];
            for (int j=1; j<dp[i].length-1; j++) {
                dp[i][j] = Math.max(dp[i-1][j-1] + arr[i][j], dp[i-1][j] + arr[i][j]);
            }
            dp[i][dp[i].length-1] = dp[i-1][dp[i-1].length-1] + arr[i][arr[i].length-1];
        }
        return Arrays.stream(dp[dp.length-1]).max().getAsInt();
    }
}