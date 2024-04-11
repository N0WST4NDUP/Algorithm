class Solution {
    public int solution(int chicken) {
        return regression(chicken);
    }
    
    public int regression(int n) {
        return n < 10 ? 0 : n/10+regression(n/10+n%10);
    }
}