import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String intStr = my_string.replaceAll("[^0-9]", "");
        String[] strArr = intStr.split("");
        Arrays.sort(strArr);
        return Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
    }
}