class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int count = 0;
        for (int[] query : queries) {
            int temp = -1;
            for (int i = query[0]; i<=query[1]; i++) {
                if (arr[i]>query[2]) {
                    temp = temp != -1 ? Math.min(temp, arr[i]) : arr[i];
                }
            }
            answer[count++] = temp;
        }
        return answer;
    }
}