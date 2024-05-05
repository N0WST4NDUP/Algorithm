import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int idx = 0;
        for (int i=1; i<array.length; i++) {
            if (Math.abs(array[idx]-n) > Math.abs(array[i]-n)) idx = i;
        }
        return array[idx];
    }
}