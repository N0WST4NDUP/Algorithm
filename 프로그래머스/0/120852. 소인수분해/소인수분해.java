import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(2, n).filter(i -> isPrime(i) && n%i == 0).toArray();
    }
    
    public boolean isPrime(int n) {
        for (int i = 2; i<=(int)Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
	return true;
}
}