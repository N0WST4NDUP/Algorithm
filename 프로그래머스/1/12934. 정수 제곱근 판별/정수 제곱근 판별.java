class Solution {
    public long solution(long n) {
        long root = (long)Math.sqrt(n);
        if (root*root != n) return -1;
        return (long)Math.pow(root+1, 2);
    }
}