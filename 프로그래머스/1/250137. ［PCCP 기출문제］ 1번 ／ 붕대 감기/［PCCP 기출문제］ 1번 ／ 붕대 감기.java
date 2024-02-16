class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int curr = health;
		int t = 0;
		int atkCount = 0;
		for (int i=1;i<=attacks[attacks.length-1][0];i++) {
			if (attacks[atkCount][0]==i) {
				curr -= attacks[atkCount][1];
				atkCount++;
				t = 0;
			} else {
				if (curr <= health-bandage[1]) {
					curr += bandage[1];
				} else {
					curr = health;
				}
				t++;
			}
			
			if (t == bandage[0]) {
				if (curr <= health-bandage[2]) {
					curr += bandage[2];
				} else {
					curr = health;
				}
                t = 0;
			}
			
			if (curr<=0) {
				return -1;
			}
		}
        return curr;
    }
}