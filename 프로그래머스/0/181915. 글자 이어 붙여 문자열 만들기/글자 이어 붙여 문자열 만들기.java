class Solution {
    public String solution(String my_string, int[] index_list) {
        char[] charArr = my_string.toCharArray();
        StringBuilder bd = new StringBuilder();
        for (int i : index_list) {
            bd.append(charArr[i]);
        }
        return bd.toString();
    }
}