class Solution {
    public int solution(int[][] dots) {
        
        if (getSlope(dots[0], dots[1]) == getSlope(dots[2], dots[3]))
            return 1;
        
        else if (getSlope(dots[0], dots[2]) == getSlope(dots[1], dots[3]))
            return 1;
        
        else if (getSlope(dots[0], dots[3]) == getSlope(dots[1], dots[2]))
            return 1;
        
        else
            return 0;
        
    }
    
    public double getSlope(int[] a, int[] b) {
        return (double) Math.abs(a[1] - b[1]) / Math.abs(a[0] - b[0]);
    }
}