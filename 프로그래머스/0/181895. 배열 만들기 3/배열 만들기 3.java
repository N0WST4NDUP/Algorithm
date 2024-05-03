class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int idx = 0;
        for (int[] interval : intervals) {
            idx += interval[1]-interval[0]+1;
        }
        int[] answer = new int[idx];
        idx = 0;
        for (int[] interval : intervals) {
            for (int i=interval[0]; i<=interval[1]; i++) {
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}