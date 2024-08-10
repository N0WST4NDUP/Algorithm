import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[][] arr = new int[emergency.length][];
        
        for (int i=0; i<emergency.length; i++) {
            int[] temp = {i, emergency[i]};
            arr[i] = temp;
        }
        
        Arrays.sort(arr, (a, b) -> b[1] - a[1]);
        
        for (int i=0; i<arr.length; i++) {
            answer[arr[i][0]] = i+1;
        }
        
        return answer;
    }
}