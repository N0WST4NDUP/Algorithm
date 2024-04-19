class Solution {
    int count = 0;
    
    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[1] = recursive(money);
        answer[0] = count;
        return answer;
    }
    
    public int recursive(int money) {
        if (money<5500) return money;
        count++;
        return recursive(money-5500);
    }
}