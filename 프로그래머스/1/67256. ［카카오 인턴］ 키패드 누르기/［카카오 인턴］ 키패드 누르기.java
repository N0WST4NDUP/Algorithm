import java.util.*;

class Solution {
    int[] currL = {3, 0};
    int[] currR = {3, 2};
    char hand;
    
    public String solution(int[] numbers, String hand) {
        this.hand = (char)(hand.charAt(0)-32);
        StringBuilder answer = new StringBuilder();
        for (int num : numbers) {
            if (num == 0) {
                answer.append(search(3, 1));
                continue;
            }
            
            if (num == 1 || num == 4 || num == 7) {
                answer.append('L');
                currL = new int[] {(num-1)/3, (num-1)%3};
            } else if (num == 3 || num == 6 || num == 9) {
                answer.append('R');
                currR = new int[] {(num-1)/3, (num-1)%3};
            } else {
                answer.append(search((num-1)/3, (num-1)%3));
            }
        }
        return answer.toString();
    }
    
    public char search(int targetY, int targetX) {
        int distL = Math.abs(targetY-currL[0]) + Math.abs(targetX-currL[1]);
        int distR = Math.abs(targetY-currR[0]) + Math.abs(targetX-currR[1]);
                
        if (distL < distR) {
            currL = new int[] {targetY, targetX};
            return 'L';
        } else if (distL > distR) {
            currR = new int[] {targetY, targetX};
            return 'R';
        } else {
            if (hand == 'L') currL = new int[] {targetY, targetX};
            else currR = new int[] {targetY, targetX};
            
            return hand;
        }
    }
}