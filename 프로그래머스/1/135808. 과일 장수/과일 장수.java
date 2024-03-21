import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int temp = k;
        int count = 1;
        
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int i=1; i<score.length; i++) {
            temp = Math.min(arr[i],arr[i-1]);
            count++;
            
            if (count < m) continue;
            
            answer += temp*m;
            count = 0;
        }
        
        return answer;
    }
}