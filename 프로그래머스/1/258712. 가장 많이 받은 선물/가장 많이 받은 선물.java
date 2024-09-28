import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Friend> map = new HashMap<>();
        for (int i=0; i<friends.length; i++) {
            map.put(friends[i], new Friend(i));
        }
        
        int[][] vector = new int[friends.length][friends.length];
        for (String gift : gifts) {
            String[] splt = gift.split(" ");
            Friend giver = map.get(splt[0]);
            Friend receiver = map.get(splt[1]);
            
            vector[giver.getIdx()][receiver.getIdx()]++;
            
            giver.increase();
            receiver.decrease();
        }
        
        int[] nextMonth = new int[friends.length];
        for (int i=0; i<friends.length; i++) {
            for (int j=i+1; j<friends.length; j++) {
                if (vector[i][j] == vector[j][i]) {
                    Friend i_friend = map.get(friends[i]);
                    Friend j_friend = map.get(friends[j]);
                    int compare = i_friend.compareTo(j_friend);
                    
                    if (compare < 0) nextMonth[j]++;
                    if (compare > 0) nextMonth[i]++;
                    
                } else {
                    if (vector[i][j] < vector[j][i]) {
                        nextMonth[j]++;
                    } else {
                        nextMonth[i]++;
                    }
                }
            }
        }
        
        int answer = 0;
        for (int num : nextMonth) {
            answer = Math.max(answer, num);
        }
        
        return answer;
    }
    
    private class Friend {
        private int idx;
        private int giftStat;
        
        public Friend(int idx) {
            this.idx = idx;
            this.giftStat = 0;
        }
        
        public Friend(int idx, int giftStat) {
            this.idx = idx;
            this.giftStat = giftStat;
        }
        
        public int getIdx() {
            return this.idx;
        }
        
        public int getGiftStat() {
            return this.giftStat;
        }
        
        public int increase() {
            return ++giftStat;
        }
        
        public int decrease() {
            return --giftStat;
        }
        
        public int compareTo(Friend friend) {
            return this.giftStat - friend.getGiftStat();
        }
    }
}