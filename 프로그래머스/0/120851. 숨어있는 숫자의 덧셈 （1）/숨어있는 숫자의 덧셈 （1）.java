class Solution {
    public int solution(String my_string) {
        return my_string.replaceAll("[a-zA-Z]", "").chars().map(c -> (int)(c-'0')).sum();
    }
}