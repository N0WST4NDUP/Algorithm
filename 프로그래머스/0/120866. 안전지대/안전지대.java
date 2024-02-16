class Solution {
    public int solution(int[][] board) {
		int size = board.length;
		int[] dx = {-1,0,1,-1,1,-1,0,1};
		int[] dy = {-1,-1,-1,0,0,1,1,1};
		int answer = 0;
		
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				if (board[i][j] == 1) {
					for (int k=0; k<8; k++) {
						if (i+dy[k]>=0 && i+dy[k]<size
                            && j+dx[k]>=0 && j+dx[k]<size
                            && board[i+dy[k]][j+dx[k]] == 0)
                        {
							board[i+dy[k]][j+dx[k]] = -1;
							answer--;
						}
					}
				} else {
					answer++;
				}
			}
		}
		
        return answer;
    }
}