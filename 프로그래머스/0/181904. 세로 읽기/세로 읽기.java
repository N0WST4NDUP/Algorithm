class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<my_string.length(); i++) {
            if (i%m+1 == c) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}