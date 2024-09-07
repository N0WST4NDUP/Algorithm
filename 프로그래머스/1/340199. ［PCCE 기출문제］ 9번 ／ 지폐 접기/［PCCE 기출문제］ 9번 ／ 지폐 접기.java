class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while (Math.max(bill[0], bill[1]) > Math.max(wallet[0], wallet[1]) 
              || Math.min(bill[0], bill[1]) > Math.min(wallet[0], wallet[1])) {
            
            bill[bill[0]>bill[1] ? 0 : 1] /= 2;
            answer++;
        }
        
        return answer;
    }
}