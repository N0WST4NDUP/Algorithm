class Solution {
    public int solution(String[][] board, int h, int w) {
        int hLng = board[0].length;
        int wLng = board.length;
        int count = 0;
        int[] dh = {0,1,-1,0}, dw = {1,0,0,-1};
        for (int i=0; i<=3; i++) {
            int h_check = h+dh[i];
            int w_check = w+dw[i];
            if (0<=h_check && h_check<hLng && 0<=w_check && w_check<wLng) {
                if (board[h][w].equals(board[h_check][w_check])) {
                    count++;  
                }
            }
        }

        return count;
    }
}