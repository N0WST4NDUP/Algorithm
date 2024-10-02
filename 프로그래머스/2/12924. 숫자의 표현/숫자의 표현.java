class Solution {
    public int solution(int n) {
        int answer = 0;
        int l = 1, r = 1;
        while (r <= n) {
            int sum = 0;
            
            for (int i = l; i <= r; i++) {
                sum += i;
            }
            
            if (sum < n) r++;
            else if (sum > n) l++;
            else if (sum == n) {
                answer++;
                r++;
            }
        }
        return answer;
    }
}