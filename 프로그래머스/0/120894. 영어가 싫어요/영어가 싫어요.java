import java.util.*;

class Solution {
    public long solution(String numbers) {
        String[] numArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i=0; i<numArr.length; i++) {
            numbers = numbers.replaceAll(numArr[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
    
    
}