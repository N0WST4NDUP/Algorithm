import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] arr = new int[1000];
        
        for (int i=0; i<array.length; i++) {
            arr[array[i]]++;
        }
        
        Integer[] temp = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        if (temp[0] == temp[1]) return -1;
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == temp[0]) answer = i;
        }
        
        
        return answer;
    }
}