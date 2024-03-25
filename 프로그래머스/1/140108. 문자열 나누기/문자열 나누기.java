class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 0;
        char temp = 0;
        for (int i=0; i<s.length()-1; i++) {
            if (temp == 0) temp = s.charAt(i);
            count += s.charAt(i) == temp ? 1 : -1;
            
            if (count > 0) continue;
            temp = 0;
            answer++;
        }
        answer++;
        return answer;
    }
}