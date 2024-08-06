import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[n];
        Arrays.fill(students, 1);
        
        for (int i : lost) {
            students[i-1]--;
        }
        
        for (int i : reserve) {
            students[i-1]++;
        }
        
        for (int i=0; i<students.length; i++) {
            if (students[i] > 1) {
                if (i > 0 && students[i-1] < 1) {
                    students[i-1]++;
                    students[i]--;
                } else if (i < students.length-1 && students[i+1] < 1) {
                    students[i+1]++;
                    students[i]--;
                }
            }
        }

        return (int)Arrays.stream(students).filter(i -> i > 0).count();
    }
}