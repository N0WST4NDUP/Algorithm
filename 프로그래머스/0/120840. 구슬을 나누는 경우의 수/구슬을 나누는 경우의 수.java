class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        int between = (balls - share < share) ? balls - share : share;

        for (int i = 0; i < between; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }

        return answer;
    }
}