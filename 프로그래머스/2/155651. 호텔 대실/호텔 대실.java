import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int[][] bookTime = new int[book_time.length][2];
        for (int i=0; i<book_time.length; i++) {
            for (int j=0; j<2; j++) {
                String[] temp = book_time[i][j].split(":");
                bookTime[i][j] = Integer.parseInt(temp[0])*60 + Integer.parseInt(temp[1]);
            }
        }
        
        Arrays.sort(bookTime, (c1, c2) -> {
            if (c1[0] == c2[0]) return c1[1] - c2[1];
            
            return c1[0] - c2[0];
        });
        
        List<Integer> required = new ArrayList<>();
        required.add(bookTime[0][1] + 10);
        label:
        for (int i=1; i<bookTime.length; i++) {
            for (int j=0; j<required.size(); j++) {
                if (bookTime[i][0] >= required.get(j)) {
                    required.set(j, bookTime[i][1] + 10);
                    continue label;
                }
            }
            
            required.add(bookTime[i][1] + 10);
        }
        return required.size();
    }
}