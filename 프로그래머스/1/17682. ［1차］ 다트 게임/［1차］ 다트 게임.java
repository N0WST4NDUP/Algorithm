import java.util.Arrays;

class Solution {
    public int solution(String result) {
        int[] cnt = new int[4];
        int idx = 1;
        for (char c : result.toCharArray()) {
            switch (c) {
                case 'S' : cnt[idx] = (int)Math.pow(cnt[idx], 1); idx++; break;
                case 'D' : cnt[idx] = (int)Math.pow(cnt[idx], 2); idx++; break;
                case 'T' : cnt[idx] = (int)Math.pow(cnt[idx], 3); idx++; break;
                case '*' : cnt[idx-1] *= 2; cnt[idx-2] *= 2; break;
                case '#' : cnt[idx-1] *= -1; break;
                case '0' : cnt[idx] *= 10; break;
                default : cnt[idx] = c-'0';
            }
        }
        return Arrays.stream(cnt).sum();
    }
}