class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] myString = my_string.toCharArray();
        for (int[] query : queries) {
            for (int i=0; i<=(query[1]-query[0])/2; i++) {
                char temp = myString[query[0]+i];
                myString[query[0]+i] = myString[query[1]-i];
                myString[query[1]-i] = temp;
            }
        }
        
        return String.valueOf(myString);
    }
}