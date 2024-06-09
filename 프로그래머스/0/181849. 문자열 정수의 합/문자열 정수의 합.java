import java.util.stream.IntStream;

class Solution {
    public int solution(String num_str) {
        return IntStream.range(0, num_str.length()).map(i -> Integer.valueOf(num_str.charAt(i)-'0')).sum();
    }
}