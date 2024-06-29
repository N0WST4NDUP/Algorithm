class Solution {
    public int solution(int n) {
        
        for (int i=1; i<=10; i++) {
            if (factorial(i) > n) return i-1;
        }
        
        return 10;
    }
    
    public int factorial(int n) {
        int result = 1;
        while (n>0) {
            result *= n;
            n--;
        }
        return result;
    }
}