import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int[] td = arrDate(today);
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String term : terms) {
        	int t = Integer.parseInt(term.substring(2));
        	map.put(term.substring(0,1),t);
        }
        
        for (int i=0; i<privacies.length; i++) {
        	int[] date = arrDate(privacies[i]);
        	String type = privacies[i].substring(privacies[i].length()-1);
        	date[1] += map.get(type);
        	date[2]--;
        	
        	if (date[1] > 12) {
        		date[0] += date[1]/12;
        		date[1] = date[1]%12;
        	}
        	
        	if (date[2] <= 0) {
        		date[2] += 28;
        		date[1]--;
        	}
        	
        	if (date[1] <= 0) {
        		date[1] += 12;
        		date[0]--;
        	} 
        	
        	if (date[0] < td[0]) {
        		answer.add(i+1);
        	} else if (date[1] < td[1] && date[0] == td[0]) {
        		answer.add(i+1);
        	} else if (date[2] < td[2] && date[1] == td[1] && date[0] == td[0]) {
        		answer.add(i+1);
        	}
        }

        return answer;
    }
    
    public static int[] arrDate(String date) {
		String yymmdd = date.replace(".", "");
        int yy = Integer.parseInt(yymmdd.substring(0,4));
        int mm = Integer.parseInt(yymmdd.substring(4,6));
        int dd = Integer.parseInt(yymmdd.substring(6,8));
        
        int[] arrDate = {yy,mm,dd};
        
        return arrDate;
	}
}