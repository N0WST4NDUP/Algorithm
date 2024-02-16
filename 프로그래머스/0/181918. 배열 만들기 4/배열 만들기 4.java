import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++) {
            if (stk.size() == 0) stk.add(arr[i]);
            else if (stk.get(stk.size()-1) < arr[i]) stk.add(arr[i]);
            else if (stk.get(stk.size()-1) >= arr[i]) {
                stk.remove(stk.size()-1);
                i--;
            }
        }
        return stk;
    }
}