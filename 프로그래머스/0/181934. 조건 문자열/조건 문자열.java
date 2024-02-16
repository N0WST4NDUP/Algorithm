class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (eq.equals("=") && n == m) {
            return 1;
        }
        
        boolean tf = ineq.equals("<") ? n<m : n>m;
        answer = tf ? 1 : 0;
        return answer;
    }
}