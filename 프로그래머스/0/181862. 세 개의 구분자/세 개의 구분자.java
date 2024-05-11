import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String s1 = myStr.replaceAll("[a-c]", " ").replaceAll(" +", " ").trim();
        if (s1.length() == 0) s1 = new String("EMPTY");
        String[] answer = s1.split(" ");
        return answer;
    }
}