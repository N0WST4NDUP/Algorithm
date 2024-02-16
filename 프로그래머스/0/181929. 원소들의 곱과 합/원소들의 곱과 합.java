class Solution {
    public int solution(int[] num_list) {
        int a = 0;
        int b = 1;
        for (int i : num_list) {
            a += i;
            b *= i;
        }
        return (a*a>b) ? 1:0;
    }
}