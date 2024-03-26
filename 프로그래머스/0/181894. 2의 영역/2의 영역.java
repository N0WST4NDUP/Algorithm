class Solution {
    public int[] solution(int[] arr) {
        int startIdx = -1;
        int lastIdx = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                if (startIdx < 0) startIdx = i;
                lastIdx = i;
            }
        }
        int[] answer = new int[lastIdx - startIdx + 1];
        for (int i=0; i<answer.length; i++) {
            if (startIdx == -1) {answer[i] = -1; break;}
            answer[i] = arr[i+startIdx];
        }
        return answer;
    }
}