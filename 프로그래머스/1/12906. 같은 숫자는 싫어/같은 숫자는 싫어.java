import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int n : arr) {
            if (stack.peek() != n) stack.push(n);
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}