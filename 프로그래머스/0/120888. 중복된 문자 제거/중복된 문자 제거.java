class Solution {
    public String solution(String my_string) {
        return my_string.chars().distinct().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}