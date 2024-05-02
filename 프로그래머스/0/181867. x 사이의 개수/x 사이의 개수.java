import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        String[] str = myString.concat("-").split("x");
        int[] answer = new int[str.length];
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = i==answer.length-1 ? str[i].length()-1 : str[i].length();
        }
        
        return answer;
    }
}