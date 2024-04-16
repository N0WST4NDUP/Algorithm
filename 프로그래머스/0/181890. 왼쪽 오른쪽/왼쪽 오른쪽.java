import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        for (int i=0; i<str_list.length; i++) {
            if (str_list[i].equals("l")) return leftArr(str_list, i);
            else if (str_list[i].equals("r")) return rightArr(str_list, i);
        }
        return new String[0];
    }
    
    public String[] leftArr(String[] arr, int idx) {
        return Arrays.copyOf(arr, idx);
    }
    
    public String[] rightArr(String[] arr, int idx) {
        return Arrays.copyOfRange(arr,idx+1,arr.length);
    }
}