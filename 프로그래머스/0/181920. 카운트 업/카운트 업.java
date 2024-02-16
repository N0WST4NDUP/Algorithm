class Solution {
    public int[] solution(int sNum, int eNum) {
        int[] answer = new int[eNum-sNum+1];
        int count = 0;
        for (int i=sNum; i<=eNum; i++) {
            answer[count++] = i;
        }
        
        return answer;
    }
}