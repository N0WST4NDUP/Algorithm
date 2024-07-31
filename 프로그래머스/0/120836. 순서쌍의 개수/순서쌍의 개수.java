class Solution {
    public int solution(int n) {
        return prime(n);
    }
    
    public int prime(int n) {
        int count = 0;
        for (int i = 1; i<=Math.sqrt(n); i++) {
            if (n%i == 0) 
                if (i*i == n) count += 1;
                else count += 2;
        }
        return count;
    }
}