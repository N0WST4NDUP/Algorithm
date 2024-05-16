import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.replaceAll("x+"," ").trim().split(" ");
        Arrays.sort(answer);
        return answer;
    }
}