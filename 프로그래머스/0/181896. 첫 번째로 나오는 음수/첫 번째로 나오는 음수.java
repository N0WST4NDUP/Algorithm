class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        while (answer < num_list.length) {
            if (num_list[answer] < 0) return answer;
            answer++;
        }
        return -1;
    }
}