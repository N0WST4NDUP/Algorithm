import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        Arrays.sort(indices);
        for (int i = indices.length; i>0; i--) {
            answer.deleteCharAt(indices[i-1]);
        }
        return answer.toString();
    }
}