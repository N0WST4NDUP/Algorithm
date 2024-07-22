import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, (o1, o2) -> o2.compareTo(o1));
        long answer = 0;
        for (String str : arr) {
            answer *= 10;
            answer += Integer.parseInt(str);
        }
        return answer;
    }
}