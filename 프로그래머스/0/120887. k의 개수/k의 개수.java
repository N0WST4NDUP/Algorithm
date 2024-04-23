class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        while (i<=j) {
            int n = i;
            if (String.valueOf(n).contains(String.valueOf(k))) {
                answer += recursive(n, k);
            }
            i++;
        }
        return answer;
    }
    
    public int recursive(int n, int k) {
        if (n <= 0) return 0;
        return n%10 == k ? 1+recursive(n/10, k) : recursive(n/10, k);
    }
}