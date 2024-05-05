import java.util.Arrays;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);
        for (int i=0; i<numlist.length; i++) {
            for (int j=0; j<numlist.length; j++) {
                if (Math.abs(numlist[i]-n) < Math.abs(numlist[j]-n)) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }
        for (int k=0; k<numlist.length-1; k++) {
            if (Math.abs(numlist[k]-n) == Math.abs(numlist[k+1]-n) && numlist[k] < numlist[k+1]) {
                int temp = numlist[k];
                numlist[k] = numlist[k+1];
                numlist[k+1] = temp;
            } 
        }
        return numlist;
    }
}