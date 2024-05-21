import java.util.stream.LongStream;

class Solution {
    public long[] solution(int x, int n) {
        return LongStream.range(1,n+1).map(l -> x*l).toArray();
    }
}