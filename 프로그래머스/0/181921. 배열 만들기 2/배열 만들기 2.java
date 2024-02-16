import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int lng = (int)Math.log10(r);
        for (int i=0; i<=lng; i++) {
            int size = list.size();
            int temp = 5*(int)Math.pow(10,i);
            list.add(temp);
            for (int j=0; j<size; j++) {
                 list.add(temp + list.get(j));
            }
        }
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i=0; i<list.size(); i++) {
            if (l<=list.get(i) && list.get(i)<=r) {
                answer.add(list.get(i));
            }
        }
        
        if (answer.size() == 0) answer.add(-1);
        return answer;
    }
}