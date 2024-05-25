class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        return arr.length%2 == 0 ? arr[arr.length/2-1]+arr[arr.length/2] : arr[arr.length/2];
    }
}