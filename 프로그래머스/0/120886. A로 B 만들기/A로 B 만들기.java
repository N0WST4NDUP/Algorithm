import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] bCharArr = before.toCharArray();
        char[] aCharArr = after.toCharArray();
        Arrays.sort(bCharArr); Arrays.sort(aCharArr);
        
        return Arrays.equals(bCharArr, aCharArr) ? 1 : 0;
    }
}