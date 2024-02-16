class Solution {
    public int[] solution(int[] num_list) {
        int lng = num_list.length;
        int[] answer = new int[lng + 1];
        for (int i=0; i<num_list.length; i++) {
            answer[i] = num_list[i];
        }
        answer[lng] = num_list[lng-1]>num_list[lng-2] ? num_list[lng-1]-num_list[lng-2] : num_list[lng-1]*2;
        return answer;
    }
}