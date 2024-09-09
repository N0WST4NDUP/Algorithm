import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantIdxMap = new HashMap<>();
        for (int i=0; i<want.length; i++) {
            wantIdxMap.put(want[i], i);
        }
        
        for (int i=0; i<=discount.length-10; i++) {
            boolean isOk = true;
            int[] copyNumArr = Arrays.copyOf(number, number.length);
            for (int j=0; j<10; j++) {
                if (!wantIdxMap.containsKey(discount[i+j])) continue;
                
                copyNumArr[wantIdxMap.get(discount[i+j])]--;
            }
            
            for (int k=0; k<copyNumArr.length; k++) {
                if (copyNumArr[k] > 0) {
                    isOk = false;
                    break;
                }
            }
            
            if (isOk) answer++;
        }
        return answer;
    }
}