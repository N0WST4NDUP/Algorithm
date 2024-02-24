import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer;
        ArrayList<int[]> list = new ArrayList<int[]>();
        int index = 0;
        
        if (ext.equals("date")) index = 1;
        else if (ext.equals("maximum")) index = 2;
        else if (ext.equals("remain")) index = 3;
        
        for (int[] row : data) {
            if (row[index] < val_ext) {
            	list.add(row);
            }
        }
        
        if (sort_by.equals("code")) index = 0;
        else if (sort_by.equals("date")) index = 1;
        else if (sort_by.equals("maximum")) index = 2;
        else if (sort_by.equals("remain")) index = 3;
        final int fIndex = index;
        
        answer = new int[list.size()][4];
        
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] arr1, int[] arr2) {
                return Integer.compare(arr1[fIndex], arr2[fIndex]);
            }
        });
        
        for (int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}