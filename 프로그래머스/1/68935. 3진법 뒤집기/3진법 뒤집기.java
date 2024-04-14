class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] trit = Integer.toString(n,3).split("");
        for (int i=trit.length-1; i>=0; i--) {
            if (trit[i].equals("0")) continue;
            
            answer += Integer.parseInt(trit[i])*Math.pow(3,i);
        }
        return answer;
    }
}