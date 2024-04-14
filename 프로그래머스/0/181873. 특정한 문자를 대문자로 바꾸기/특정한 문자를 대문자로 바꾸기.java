class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();
        for (int i=0; i<my_string.length(); i++) {
            answer.append(my_string.charAt(i) == alp.charAt(0) ?
                          (char)(my_string.charAt(i)-32) : my_string.charAt(i));
        }
        return answer.toString();
    }
}