import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> rpMap = new HashMap<>();
        Map<String, Set<String>> list = new HashMap<>();
        List<String> blacklist = new ArrayList<>();
        int[] answer = new int[id_list.length];
        for (String s : report) {
        	String[] rpt = s.split(" ");
        	Set<String> set = list.containsKey(rpt[0]) ? list.get(rpt[0]) : new HashSet<>();
        	if (set.add(rpt[1])) {
        		Integer count = rpMap.containsKey(rpt[1]) ? rpMap.get(rpt[1])+1 : 1;
            	rpMap.put(rpt[1],count);
        	}
        	list.put(rpt[0], set);
        	
    		
    		if (rpMap.get(rpt[1]) == k) blacklist.add(rpt[1]);
        }
        
        for (int i=0; i<id_list.length; i++) {
        	if (!list.containsKey(id_list[i])) continue;
        	Iterator<String> iterator = list.get(id_list[i]).iterator();
        	while (iterator.hasNext()) {
        		if (blacklist.contains(iterator.next())) {answer[i]++;}
        	}
        }
        
        return answer;
    }
}