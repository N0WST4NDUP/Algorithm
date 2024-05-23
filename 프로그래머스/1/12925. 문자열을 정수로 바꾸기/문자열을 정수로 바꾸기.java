class Solution {
    public int solution(String s) {
        switch(s.charAt(0)) {
            case '+' : return Integer.parseInt(s.substring(1, s.length()));
            case '-' : return Integer.parseInt(s.substring(1, s.length()))*(-1);
            default  : return Integer.parseInt(s);
        }
    }
}