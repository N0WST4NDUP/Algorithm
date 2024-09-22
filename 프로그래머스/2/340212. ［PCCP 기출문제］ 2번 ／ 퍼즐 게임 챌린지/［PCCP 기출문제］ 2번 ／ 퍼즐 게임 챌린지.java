class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int min = 1;
        int max = 100000;
        int answer = 0;
        
        while (min <= max) {
            int level = (min + max)/2;
            
            if (isPossible(diffs, times, limit, level)) {
                answer = level;
                max = level-1;
            } else {
                min = level+1;
            }
        }
        
        return answer;
    }
    
    public boolean isPossible(int[] diffs, int[] times, long limit, int level) {
        long total = (diffs[0] > level) ?
                        times[0] * (diffs[0]-level+1) : times[0];
        
        for (int i=1; i<diffs.length; i++) {
            total += (diffs[i] > level) ? 
                        (times[i-1] + times[i]) * (diffs[i]-level) + times[i] : times[i];
        }
        
        return total <= limit;
    }
}