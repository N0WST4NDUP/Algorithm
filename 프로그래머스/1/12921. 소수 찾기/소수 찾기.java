import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.range(2, n+1).map(i -> isPrime(i)).sum();
    }
    
    public int isPrime(int n) {
        for (int i=2; i<=Math.sqrt(n); i++) if (n%i == 0) return 0;
        return 1;
    }
}