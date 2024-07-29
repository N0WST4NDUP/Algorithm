class Solution {
    public int solution(int n) {
        return lcm(n);
    }
    
    int lcm(int n) {
        int i = 0;
        boolean tf = false;
        while (!tf) {
            i += 6;
            
            if (i%n == 0) tf = true;
        }
        return i/6;
    }
}