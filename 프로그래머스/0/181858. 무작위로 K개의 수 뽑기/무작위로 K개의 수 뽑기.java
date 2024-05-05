import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = IntStream.range(0, k).map(i -> -1).toArray();
        answer[0] = arr[0];
        for (int i=1; i<arr.length; i++) {
            for (int j=0; arr[i] != arr[i-1] && j<answer.length; j++) {
                if (answer[j] == arr[i]) break;
                if (answer[j] > -1) continue;
                    
                answer[j] = arr[i];
                break;
            }
        }
        return answer;
    }
}