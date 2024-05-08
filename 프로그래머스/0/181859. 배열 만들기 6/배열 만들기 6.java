import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        stk.push(arr[0]);
        
        for (int i=1; i<arr.length; i++) {
            if (stk.isEmpty() || stk.peek() != arr[i]) {
                stk.push(arr[i]);
            }
            else stk.pop();
        }
        
        if (stk.isEmpty()) stk.push(-1);
        
        return stk.stream().mapToInt(i -> i).toArray();
    }
}