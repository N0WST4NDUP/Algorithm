import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] cmd : commands) {
            int[] temp = Arrays.copyOfRange(array, cmd[0]-1, cmd[1]);
            Arrays.sort(temp);
            answer[idx++] = temp[cmd[2]-1];
        }
        return answer;
    }
}