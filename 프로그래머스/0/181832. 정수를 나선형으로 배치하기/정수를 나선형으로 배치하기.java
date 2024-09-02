class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int r = 0, c = 0;
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int dirIdx = 0;
        int num = 1;
        
        while(num <= n*n) {
            answer[r][c] = num++;
            
            int nr = r + dr[dirIdx%4];
            int nc = c + dc[dirIdx%4];
            
            if (nr < 0 || n <= nr || nc < 0 || n <= nc || answer[nr][nc] != 0) {
                dirIdx++;
            }
            
            r = r + dr[dirIdx%4];
            c = c + dc[dirIdx%4];
        }
        
        return answer;
    }
}