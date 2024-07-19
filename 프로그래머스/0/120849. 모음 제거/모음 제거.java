class Solution {
    public String solution(String my_string) {
        String moum = "aeiou";
        return my_string.chars().filter(c -> moum.indexOf(c)<0).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}