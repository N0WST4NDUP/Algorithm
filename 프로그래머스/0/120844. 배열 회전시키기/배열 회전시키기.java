import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int lr = direction.charAt(0) == 'l' ? 1 : numbers.length-1;
        for (int i=0; i<answer.length; i++) {
            answer[i] = numbers[(i+lr)%numbers.length];
        }
        return answer;
    }
}