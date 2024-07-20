import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        Arrays.sort(data, new CustomComparator(col));
        
        for (int i=row_begin; i<=row_end; i++) {
            int temp = 0;
            
            for (int j=0; j<data[i-1].length; j++) {
                temp += data[i-1][j]%i;
            }
            
            answer ^= temp;
        }
        
        return answer;
    }
}

class CustomComparator implements Comparator<int[]> {
    
    private int col;
    
    public CustomComparator(int col) {
        this.col = col;
    }
    
    @Override
    public int compare(int[] arr1, int[] arr2) {
        int idx = col - 1;
        
        if (arr1[idx] == arr2[idx])return arr2[0] - arr1[0];
                
        return arr1[idx] - arr2[idx];
    }
}