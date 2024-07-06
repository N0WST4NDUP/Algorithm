class Solution {
    public String solution(int age) {
        String[] ages = {"a","b","c","d","e","f","g","h","i","j"};
        String answer = "";
        while (age > 0) {
            answer = ages[age%10] + answer;
            age /= 10;
        }
        return answer;
    }
}