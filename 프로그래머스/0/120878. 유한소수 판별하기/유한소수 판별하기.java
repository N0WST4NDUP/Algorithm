import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int b) {
        int answer = b/gcd(a, b);
        while (answer%2 == 0) {
            answer /= 2;
        }
        while (answer%5 == 0) {
            answer /= 5;
        }
        return answer==1 ? answer : 2;
    }
    
    public int gcd(int a, int b) {
        if (a%b == 0) return b;
        
        return gcd(b, a%b);
    }
}