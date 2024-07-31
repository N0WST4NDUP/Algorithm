class Solution {
    public int solution(int hp) {
        int[] ants = {5, 3, 1};
        int answer = 0;
        for (int i=0; i<ants.length; i++) {
            if (hp < ants[i]) continue;
            
            answer += hp/ants[i];
            hp %= ants[i];
        }
        return answer;
    }
}