class Solution {
    public int solution(int[] nums) {
        boolean[] primeArr = new boolean[3001];
        primeSet(primeArr);
        int answer = 0;
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    if (primeArr[nums[i]+nums[j]+nums[k]]) answer++;
                }
            }
        }
        return answer;
    }
    
    public void primeSet(boolean[] arr) {
        for (int i=2; i<arr.length; i++) {
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++) {
			    if (i % j == 0) {
                    isPrime = false;
                    break;
                };
		    }
            arr[i] = isPrime;
        }
    }
}