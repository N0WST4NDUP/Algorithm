import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Arrays.sort(delete_list);
        return Arrays.stream(arr).filter(i -> Arrays.binarySearch(delete_list, i) < 0).toArray();
    }
}