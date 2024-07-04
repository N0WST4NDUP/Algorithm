import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return (int)(IntStream.rangeClosed(sides[1]-sides[0]+1, sides[1]).count() + IntStream.range(sides[1]+1, sides[0]+sides[1]).count());
    }
}