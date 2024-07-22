class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 65 && c <= 90) c = (char)(c+n-(c+n>90 ? 26 : 0));
            else if (c >= 97 && c <= 122) c = (char)(c+n-(c+n>122 ? 26 : 0));
            
            answer.append(c);
        }
        return answer.toString();
    }
}