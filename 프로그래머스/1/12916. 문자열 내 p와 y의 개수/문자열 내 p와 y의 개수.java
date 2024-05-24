class Solution {
    boolean solution(String s) {
        String str = s.toLowerCase();
        int cnt = 0;
        for (char c : str.toCharArray()) {
            if (c == 'p') cnt++;
            else if (c == 'y') cnt--;
        }
        return cnt == 0;
    }
}