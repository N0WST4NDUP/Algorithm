class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        
        for (int num : num_list) {
            if (num%2 == 0) {
                even += Integer.toString(num);
            } else {
                odd += Integer.toString(num);
            }
        }
        
        int answer = Integer.parseInt(odd) + Integer.parseInt(even);
        
        return answer;
    }
}