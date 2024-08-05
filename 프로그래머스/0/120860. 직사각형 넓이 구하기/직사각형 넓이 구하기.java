import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        Arrays.sort(dots, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            } 
        });
        return (dots[1][0]-dots[0][0]) * (dots[2][1]-dots[1][1]);
    }
}