import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        List<Stack<Integer>> list = new ArrayList<>();
        int heigth = board.length;
        int width = board[0].length;
        // 스택으로 이루어진 인형뽑기 기계 만들기
        for (int i=0; i<width; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j=heigth-1; j>=0; j--) {
                if (board[j][i] == 0) continue;
                
                stack.push(board[j][i]);
            }
            list.add(stack);
        }
        //뽑기 시작!
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int move : moves) {
            int idx = move-1;
            // 해당 하는 라인이 비었을 경우 무시하고 진행
            if (list.get(idx).isEmpty()) continue;
            
            int temp = list.get(idx).pop();
            // 바구니가 비었을 경우 바로 넣기
            if (stack.isEmpty()) {stack.push(temp); continue;}
            
            if (stack.peek() == temp) {
                stack.pop();
                answer += 2;
            } else {
                stack.push(temp);
            }
        }
        return answer;
    }
}