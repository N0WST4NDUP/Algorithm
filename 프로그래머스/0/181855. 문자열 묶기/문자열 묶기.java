import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int[] count = new int[31];
        for (String str : strArr) {
            count[str.length()]++;
        }
        return Arrays.stream(count).max().orElse(0);
    }
}