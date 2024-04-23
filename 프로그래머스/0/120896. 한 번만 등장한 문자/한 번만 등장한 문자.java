import java.util.*;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder answer = new StringBuilder();
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if (i != 0 && arr[i-1] != arr[i]) {
                if (count == 1) answer.append(arr[i-1]);
                
                count = 0;
            }
            
            count++;
        }
        if (count == 1) answer.append(arr[arr.length-1]);
        
        return answer.toString();
    }
}