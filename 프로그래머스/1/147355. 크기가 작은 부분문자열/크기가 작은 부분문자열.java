class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        char[] charArr = p.toCharArray();
        label:
        for (int i=0; i<t.length()-p.length()+1; i++) {
            for (int j=0; j<charArr.length; j++) {
                if (t.charAt(j+i) < charArr[j]) break;
                else if (t.charAt(j+i) > charArr[j]) continue label;
            }
            answer++;
        }
        
        return answer;
    }
}