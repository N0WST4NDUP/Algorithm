import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int inked = 0;
        int count = 0;
        Arrays.sort(win_nums);
        for (int num : lottos) {
            if (num == 0) {inked++; continue;}
            
            if (Arrays.binarySearch(win_nums, num) >= 0) count++;
        }
        int rank = 7-count;
        return new int[] {rank-inked>=6 ? 6 : rank-inked, rank>=6 ? 6 : rank};
    }
}