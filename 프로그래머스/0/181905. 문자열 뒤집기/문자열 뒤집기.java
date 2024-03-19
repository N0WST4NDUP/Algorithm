class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string.substring(0,s));
        for (int i=e; i>=s; i--) {
            answer.append(my_string.charAt(i));
        }
        answer.append(my_string.substring(e+1));
        System.out.println(answer);
        return answer.toString();
    }
}