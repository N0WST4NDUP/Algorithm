class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][];
        for (int i=0; i<answer.length; i++) {
            int[] temp = new int[arr1[i].length];
            for (int j=0; j<temp.length; j++) {
                temp[j] = arr1[i][j] + arr2[i][j];
            }
            answer[i] = temp;
        }
        return answer;
    }
}