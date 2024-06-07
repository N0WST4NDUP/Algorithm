import java.util.stream.IntStream;

class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        int[] answer = IntStream.range(0, sb.length()).map(i -> sb.charAt(i)-'0').toArray();
        return answer;
    }
}