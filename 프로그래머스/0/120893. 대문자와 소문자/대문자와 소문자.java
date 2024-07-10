class Solution {
    public String solution(String my_string) {
        return my_string.chars().map(c -> c<94 ? c+32 : c-32).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}