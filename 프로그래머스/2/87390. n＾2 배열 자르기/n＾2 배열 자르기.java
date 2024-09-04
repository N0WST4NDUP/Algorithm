class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        
        for (int i=0; i<answer.length; i++) {
            int row = (int)((left+i)/n);
            int col = (int)((left+i)%n);
            
            answer[i] = Math.max(row, col)+1;
        }
        
        return answer;
    }
}