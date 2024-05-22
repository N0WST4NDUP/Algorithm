class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int curr = x;
        while (curr>0) {
            sum += curr%10;
            curr = curr/10;
        }
        return x%sum == 0 ? true : false;
    }
}