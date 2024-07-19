class Solution {
    public int solution(int storey) {
        int answer = 0;
        while (storey > 0) {
            int left = storey%10;
            
            if (left > 5) {
                answer += 10 - left;
                storey += 10;
            } else if (left < 5) {
                answer += left;
            } else {
                int temp = storey/10%10+1;
                
                if (temp > 5) {
                    answer += 10 - left;
                    storey += 10;
                } else {
                    answer += left;
                }
            }
            
            storey /= 10;
        }
        return answer;
    }
}