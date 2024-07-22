import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        return IntStream.rangeClosed(1, num_list.length).map(i -> num_list[num_list.length-i]).toArray();
    }
}