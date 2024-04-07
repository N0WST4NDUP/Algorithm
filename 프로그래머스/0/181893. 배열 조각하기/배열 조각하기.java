import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for (int i=0; i<query.length; i++) {
            arr = i%2==0 ? even(arr,query[i]) : odd(arr,query[i]);
        }
        return arr;
    }
    
    public int[] odd(int[] arr, int idx) {
        return Arrays.copyOfRange(arr, idx, arr.length);
    }
    
    public int[] even(int[] arr, int idx) {
        return Arrays.copyOfRange(arr, 0, idx+1);
    }
}