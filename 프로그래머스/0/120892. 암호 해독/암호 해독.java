class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        int count = 0;
        for (String str : cipher.split("")) {
            count++;
            if (count == code) {
                answer.append(str);
                count = 0;
            }
        }
        return answer.toString();
    }
}