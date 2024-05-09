import java.util.*;

class Solution {
    Map<Integer, int[]> map = new HashMap<>();
	//int[] {in-degree, out-degree}
	public int[] solution(int[][] edges) {
		int root=0, doughnut=0, bar=0, oct=0;
		for (int[] edge : edges) {
			if (!map.containsKey(edge[0])) map.put(edge[0], new int[2]);
			if (!map.containsKey(edge[1])) map.put(edge[1], new int[2]);
			
			map.get(edge[0])[1]++;
			map.get(edge[1])[0]++;
		}
		
		Set<Integer> set = map.keySet();
		for (Integer key : set) {
			if (map.get(key)[0] == 0 && map.get(key)[1] > 1) root = key;
			if (map.get(key)[0] == 1 && map.get(key)[1] == 1) map.put(key, null);
		}
		
		for (Integer key : set) {
			if (key == root || map.get(key) == null) continue;
			
			if (map.get(key)[1] == 0) {
				bar++;
				map.get(root)[1]--;
			} 
			else if (map.get(key)[1] > 1) {
				oct++;
				map.get(root)[1]--;
			}
		}
		doughnut = map.get(root)[1];
		
		return new int[] {root, doughnut, bar, oct};
	}
}