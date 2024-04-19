class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        for (String s : rsp.split("")) {
            int result = (int)(Float.parseFloat(s) - 2.5);
            if (result < 0) result = 5;
            answer.append(result);
        }
        return answer.toString();
    }
}