import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        
        Arrays.sort(spell);
        
        StringBuilder sb = new StringBuilder();
        for (String str : spell) {
            sb.append(str);
        }
        String newSpell = sb.toString();
        
        for (String str : dic) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            
            if (newSpell.equals(new String(arr))) return 1;
        }
        
        return 2;
    }
}