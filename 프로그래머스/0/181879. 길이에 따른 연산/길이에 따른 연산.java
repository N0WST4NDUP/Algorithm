import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        return num_list.length > 10 ? sum(num_list) : times(num_list);
    }
    
    int times(int[] num_list) {
        return Arrays.stream(num_list).reduce(1, (x, y) -> x * y);
    }
    
    int sum(int[] num_list) {
        return Arrays.stream(num_list).sum();
    }
}