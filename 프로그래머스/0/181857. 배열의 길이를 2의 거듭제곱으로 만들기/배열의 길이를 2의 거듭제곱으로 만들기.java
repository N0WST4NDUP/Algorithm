import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return arr;
        int[] answer = {};
        for (int i=0; i<10; i++) {
            if (2<<i >= arr.length) {
                answer = Arrays.copyOf(arr, 2<<i);
                break;
            }
        }
        return answer;
    }
}