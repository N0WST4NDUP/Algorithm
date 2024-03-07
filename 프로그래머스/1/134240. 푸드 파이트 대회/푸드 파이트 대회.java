class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for (int i=1; i<food.length; i++) {
            for (int j=1; j<food[i]; j+=2) {
                answer.append(i);
            }
        }
        return answer.append(new StringBuilder(answer).append(0).reverse()).toString();
    }
}