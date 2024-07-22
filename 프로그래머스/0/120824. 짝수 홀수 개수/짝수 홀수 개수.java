class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int num : num_list) {
            answer[num%2]++;
        }
        return answer;
    }
}