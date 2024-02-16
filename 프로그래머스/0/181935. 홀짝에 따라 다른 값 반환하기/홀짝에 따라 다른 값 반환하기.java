class Solution {
    public int solution(int n) {
        int answer = 0;
		int s = n%2;
		switch (s) {
			case 0:
				for (int i = 1; i<=n/2; i++) {
					answer += Math.pow(i*2,2);
				} break;
			case 1:
				for (int i = 0; i<(n+1)/2; i++) {
					answer += (i*2)+1;
				} break;
		}
        return answer;
    }
}