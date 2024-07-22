class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int idx = 0;
        
        for (String str : s.split("")) {
            if (str.equals(" ")) {
                idx = 0;
            } else if (idx%2 == 0) {
                str = str.toUpperCase();
                idx++;
            } else {
                str = str.toLowerCase();
                idx++;
            }
            
            answer.append(str);
        }
        
        return answer.toString();
    }
}