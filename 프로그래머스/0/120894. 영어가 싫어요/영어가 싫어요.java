import java.util.*;

class Solution {
    public long solution(String numbers) {
        String[] numArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        List<String> list = new ArrayList<>(Arrays.asList(numArr));
        long answer = 0;
        int curr = 0;
        for (int i=0; i<numbers.length(); i++) {
            int num = list.indexOf(numbers.substring(curr, i+1));
            if (num < 0) continue;
                
            curr = i+1;
            answer *= 10;
            answer += num;
        }
        return answer;
    }
    
    
}