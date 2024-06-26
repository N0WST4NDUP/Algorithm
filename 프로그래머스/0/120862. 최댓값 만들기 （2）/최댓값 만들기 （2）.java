import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int lastIdx = numbers.length-1;
        return Math.max(numbers[0]*numbers[1], numbers[lastIdx]*numbers[lastIdx-1]);
    }
}