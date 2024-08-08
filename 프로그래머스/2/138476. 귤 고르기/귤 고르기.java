import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        int[] arr = new int[10_000_001];
        for (int size : tangerine) {
            arr[size]++;
        }
        Arrays.sort(arr);
        
        while (k > 0) {
            answer++;
            k -= arr[arr.length - answer];
        }
        
        return answer;
    }
}