import java.math.BigInteger;

class Solution {
    public int[] solution(int n, int m) {
        int gcd = BigInteger.valueOf(n).gcd(BigInteger.valueOf(m)).intValue();
        return new int[] {gcd, n*m/gcd};
    }
}