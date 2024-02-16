import java.util.*;

public class Solution {
	int[] dx = {-1,0,0,1};
	int[] dy = {0,-1,1,0};
	int id = 1;
	int[][] oilId;
	
	public int solution(int[][] land) {
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
				if (nx >= 0 && nx < land[0].length &&
                ny >= 0 && ny < land.length &&
                oilId[ny][nx] == 0 && land[ny][nx] == 1) {
					q.offer(new int[] {ny,nx});
					oilId[ny][nx] = id;
					size++;
				}
			}
		}
		
		return size;
	}
}