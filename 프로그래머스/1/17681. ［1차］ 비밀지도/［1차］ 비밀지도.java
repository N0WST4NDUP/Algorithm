class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        char[][] secretMap = new char[n][n];
        // arr1
        for (int i=0; i<secretMap.length; i++) {
            String binary = Integer.toBinaryString(arr1[i]);
            int idx = n-1;
            for (int j=binary.length()-1; j>=0; j--) {
                if (binary.charAt(j) == '1') secretMap[i][idx] = '#';
                idx--;
            }
        }
        // arr2
        for (int i=0; i<secretMap.length; i++) {
            String binary = Integer.toBinaryString(arr2[i]);
            int idx = n-1;
            for (int j=binary.length()-1; j>=0; j--) {
                if (binary.charAt(j) == '1') secretMap[i][idx] = '#';
                idx--;
            }
        }
        String[] answer = new String[n];
        for (int i=0; i<answer.length; i++) {
            answer[i] = new String(secretMap[i]).replace("\u0000", " ");
        }
        return answer;
    }
}