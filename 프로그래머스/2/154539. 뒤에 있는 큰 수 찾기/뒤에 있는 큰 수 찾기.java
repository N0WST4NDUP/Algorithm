import java.util.Stack;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);

        Stack<Integer> stk = new Stack<Integer>();

        for(int i = numbers.length-1; i>-1; i--){
            while (!stk.empty() && numbers[i] >= stk.peek()){
                stk.pop();
            }

            if(!stk.empty()){
                answer[i] = stk.peek();
            }

            stk.push(numbers[i]);
        }
        return answer;
    }
}