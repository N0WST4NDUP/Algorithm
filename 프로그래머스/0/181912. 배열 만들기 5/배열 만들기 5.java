import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        for (String intStr : intStrs) {
            int subStr = Integer.parseInt(intStr.substring(s,s+l));
            if (subStr>k)
                list.add(subStr);
        }
        return list;
    }
}