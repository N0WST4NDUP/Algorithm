package test.java.PCCP.Lv2.석유시추;

import java.util.*;

import com.sun.tools.javac.util.Iterators;

public class Solution {
	int[] dx = {-1,0,0,1};
	int[] dy = {0,-1,1,0};
	int id = 1;
	int[][] oilId;
	
	public int solution(int[][] land) {
		id = 1;
		int yLng = land.length;
		int xLng = land[0].length;
        this.oilId = new int[land.length][land[0].length];
        int most = 0;
        
        Map<Integer, Integer> oilSize = new HashMap<>();
        
        for (int i=0; i<xLng; i++) {
        	for (int j=0; j<yLng; j++) {
                if (land[j][i] == 0) continue;
                
        		if (oilId[j][i] == 0) {
        			int size = bfs(land,j,i);
            		oilSize.put(id++,size);
            	}
        	}
        }
        
        for (int i=0; i<xLng; i++) {
        	List<Integer> column = new ArrayList<>();
        	int size = 0;
        	for (int j=0; j<yLng; j++) {
        		if (land[j][i] > 0 && !column.contains(oilId[j][i])) {
        			column.add(oilId[j][i]);
        		}
        	}
        	
        	for (int id : column) {
        		size += oilSize.get(id);
        	}
        	
        	most = Math.max(most, size);
        }
        
        return most;
    }
	
//	private void dfs(int y, int x, int id) {
//		oilId[y][x] = id;
//		size++;
//		
//		for (int i=0; i<4; i++) {
//			int ny = y+dy[i];
//			int nx = x+dx[i];
//				
//			if (nx >= 0 && nx < xLng && ny >= 0 && ny < yLng && land[ny][nx] == 1 && oilId[ny][nx] == 0) 
//					dfs(ny, nx, id);
//		}
//		
//	}
	
	private int bfs(int[][] land, int y, int x) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {y,x});
		oilId[y][x] = id;
		int size = 1;
		
		while(!q.isEmpty()) {
			int[] curr = q.poll();
			for (int i = 0; i<4; i++) {
				int ny = curr[0] + dy[i];
				int nx = curr[1] + dx[i];
				if (nx >= 0 && nx < land[0].length && ny >= 0 && ny < land.length && oilId[ny][nx] == 0 && land[ny][nx] == 1) {
					q.offer(new int[] {ny,nx});
					oilId[ny][nx] = id;
					size++;
				}
			}
		}
		
		return size;
	}
    
//###########################################################################
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	
    	int[][] land1 = { { 1, 1, 1, 0, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0, 1, 1 }, { 1, 1, 0, 0, 0, 1, 1, 0 }, { 0, 0, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 1, 1, 1, 0, 0 } };
    	int result1 = s.solution(land1);
        System.out.println("Result1 : " + result1);
        
        int[][] land2 = { { 1, 0, 1, 0, 1, 1 }, { 1, 0, 1, 0, 0, 0 }, { 1, 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 0, 0 }, { 1, 0, 0, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1 } };
        int result2 = s.solution(land2);
        System.out.println("Result2 : " + result2);
        
        int[][] land3 = {
			                {1, 1, 1, 1},
			                {1, 0, 0, 0},
			                {1, 0, 1, 0},
			                {1, 0, 0, 0},
			                {1, 1, 1, 1}
			            };
        int result3 = s.solution(land3);
        System.out.println("Result3 : " + result3);
        
//    	printArr(a);
    }
    
    public static void printArr(List arr) {
    	for (Object o : arr) {
    		System.out.println(o.toString());
    	}
    }
    
    public static void printArr(Object[] arr) {
    	for (Object o : arr) {
    		System.out.println(o.toString());
    	}
    }
    
    public static void printArr(int[] arr) {
    	for (int i : arr) {
    		System.out.println(i);
    	}
    }
}