class Solution {
    
    public long solution(int price, long money, int count) {
        while (count > 0) {
            money -= price*count--;
        }
        return (money > 0) ? 0 : Math.abs(money);
    }

}