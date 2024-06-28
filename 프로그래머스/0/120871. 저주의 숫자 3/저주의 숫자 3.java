import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(1, 300).filter(i -> i%3!=0 && !String.valueOf(i).contains("3")).toArray()[n-1];
    }
}