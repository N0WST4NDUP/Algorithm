import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};
        return Arrays.stream(arr).filter(i -> i != Arrays.stream(arr).min().getAsInt()).toArray();
    }
}