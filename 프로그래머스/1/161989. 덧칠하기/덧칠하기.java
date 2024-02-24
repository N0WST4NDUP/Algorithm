class Solution {
    public int solution(int n, int m, int[] section) {
		int answer = 0;
		int firstIdx = section[0]-1;
		int lastIdx = section[section.length-1]-1;
		
		boolean[] wall = new boolean[n];
        
        for (int s : section) {
        	wall[s-1] = true;
        }

        int i = firstIdx;
        while (i <= lastIdx) {
        	if (wall[i]) {
                answer++;
        		for (int j=0; j<m && i <= lastIdx; j++) {
        			wall[i++] = false;
        		}
            }
        	else i++;
        }
        
        return answer;
    }
}