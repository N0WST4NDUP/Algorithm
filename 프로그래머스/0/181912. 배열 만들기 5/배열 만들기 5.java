import java.util.ArrayList;

class Solution {
    public ArrayList<Long> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Long> list = new ArrayList<>();
        for (String intStr : intStrs) {
            long subStr = Long.parseLong(intStr.substring(s,s+l));
            if (subStr>k)
                list.add(subStr);
        }
        return list;
    }
}