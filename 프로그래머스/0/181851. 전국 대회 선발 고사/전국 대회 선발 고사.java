import java.util.stream.IntStream;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int[] arr = IntStream.range(0, rank.length).filter(x -> attendance[x]).boxed().sorted((a, b) -> rank[a]-rank[b]).mapToInt(Integer::intValue).toArray();
        return 10000*arr[0]+100*arr[1]+arr[2];
    }
}