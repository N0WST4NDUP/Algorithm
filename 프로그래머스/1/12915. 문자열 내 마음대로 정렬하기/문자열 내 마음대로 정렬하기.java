import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new OwnComparator(n));
        return strings;
    }
}

class OwnComparator implements Comparator<String> {
    
    private int n;
    
    public OwnComparator(int n) {
        this.n = n;
    }
    
    @Override
    public int compare(String s1, String s2) {
        if (s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
        return s1.charAt(n) - s2.charAt(n);
    }
}