class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] Xarr = new int[10];
        for (char c : X.toCharArray()) Xarr[c-'0']++;
        int[] Yarr = new int[10];
        for (char c : Y.toCharArray()) Yarr[c-'0']++;
        
        for (int i=9; i>=0; i--) {
            if (Xarr[i]>0 && Yarr[i]>0) {
                if (i == 0 && answer.length() == 0) answer.append(0);
                else answer.append(String.valueOf(i).repeat(Math.min(Xarr[i], Yarr[i])));
            }
        }
        
        return answer.length()==0 ? "-1" : answer.toString();
    }
}