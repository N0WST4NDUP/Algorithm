class Solution {
    public int[] solution(int[] arr, int n) {
        boolean tf = arr.length%2 == 0 ? true : false;
        for (int i=0; i<arr.length; i++) {
            if (!tf && i%2 == 0) arr[i] += n;
            else if (tf && i%2 != 0) arr[i] += n;
        }
        return arr; 
    }
}