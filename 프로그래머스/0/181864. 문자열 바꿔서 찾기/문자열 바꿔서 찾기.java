class Solution {
    public int solution(String myString, String pat) {
        String str = myString.replace("A", "b").replace("B", "a");
        return str.contains(pat.toLowerCase()) ? 1 : 0;
    }
}