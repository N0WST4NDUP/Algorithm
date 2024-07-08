class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        for (String str : my_string.split("")) {
            answer.append(str.repeat(n));
        }
        return answer.toString();
    }
}