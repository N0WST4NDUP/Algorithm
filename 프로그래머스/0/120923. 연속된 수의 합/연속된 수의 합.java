class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int fNum = (num%2==0) ? (total/num-num/2+1) : (total/num-num/2);
        for (int i=0; i<answer.length; i++) {
            answer[i] = fNum+i;
        }
        return answer;
    }
}