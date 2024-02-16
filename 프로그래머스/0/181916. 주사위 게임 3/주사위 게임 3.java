import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] result = {a,b,c,d};
        Arrays.sort(result);
        return result[0] == result[1] ?
            onlyTwo(result[0],result[2],result[3]) : result[1] == result[2] ?
            onlyTwo(result[1],result[0],result[3]) : result[2] == result[3] ?
            onlyTwo(result[2],result[0],result[1]) : result[0];
    }
    
    public int four(int p) {
        return 1111*p;
    }
    
    public int three(int p, int q) {
        if (p == q) return four(p);
        return (int)Math.pow(10*p+q,2);
    }
    
    public int twoTwo(int p, int q) {
        if (p == q) return four(p);
        return (p+q)*(int)Math.abs(p-q);
    }
    
    public int onlyTwo(int p, int q, int r) {
        if (p == q || p == r) return three(p,q+r-p);
        if (q == r) return twoTwo(p, q);
        return q*r;
    }
}