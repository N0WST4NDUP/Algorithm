class Solution {
    public int solution(int num, int k) {
        String sNum = String.valueOf(num);
        String sK = String.valueOf(k);
        return sNum.contains(sK) ? sNum.indexOf(sK)+1 : -1;
    }
}