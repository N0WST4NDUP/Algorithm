class Solution {
    public int solution(long num) {
        for (int i=0; i<500; i++) {
            if (num == 1) return i;
            
            num = num%2==0 ? num/2 : num*3+1;
        }
        return -1;
    }
}