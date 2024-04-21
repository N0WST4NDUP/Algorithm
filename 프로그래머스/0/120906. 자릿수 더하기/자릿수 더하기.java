class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1000000;
        while (i>0) {
            answer += n/i;
            n %= i;
            i /= 10;
        }
        return answer;
    }
}