class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            answer[i] = arr[i] >= 50 ? isEven(arr[i]) : isOdd(arr[i]);
        }
        return answer;
    }
    
    public int isOdd(int n) {
        return n%2 != 0 ? n*2 : n;
    }
    
    public int isEven(int n) {
        return n%2 == 0 ?n/2 : n;
    }
}