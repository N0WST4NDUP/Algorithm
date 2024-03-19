class Solution {
    public int solution(int n) {
        boolean[] prime = new boolean[n];
        for (int i=2; i<n; i++) {
            if (prime[i]) continue;
            if (n%i == 1) return i;
            for (int j = i*2; j<n; j+=i) {
                if (prime[j]) continue;
                prime[j] = true;
            }
        }
        return -1;
    }
}