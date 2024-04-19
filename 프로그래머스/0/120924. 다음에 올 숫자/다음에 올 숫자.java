class Solution {
    public int solution(int[] common) {
        int a1 = common[1]-common[0];
        int a2 = common[2]-common[1];
        int idx = common.length-1;
        return a1==a2 ? common[idx]+(common[idx]-common[idx-1]) : (int)Math.pow(common[idx],2)/common[idx-1] ;
    }
}