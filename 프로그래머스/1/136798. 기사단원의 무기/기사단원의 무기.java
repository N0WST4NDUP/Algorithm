class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i=1; i<=number; i++) {
            int atk = divisor(i);
            answer += (atk > limit) ? power : atk;
        }
        return answer;
    }
    
    int divisor(int num) {
        int count = 0;
        for (int i=1; i*i<=num; i++) {
            count += (num%i == 0) ? (num/i != i) ? 2 : 1 : 0;
        }
        return count;
    }
}