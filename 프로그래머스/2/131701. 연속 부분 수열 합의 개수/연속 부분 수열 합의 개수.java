import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] elements) {
        int[] circular = IntStream.range(0, elements.length*2).map(i -> elements[i%elements.length]).toArray();
        
        Set<Integer> resultSet = new HashSet<>();
        int targetLength = 1;
        
        while(targetLength <= elements.length) {
            for (int i=0; i<elements.length; i++) {
                int sum = 0;
                for (int j=0; j<targetLength; j++) {
                    sum += circular[i+j];
                }
                resultSet.add(sum);
            }
            targetLength++;
        }
        return resultSet.size();
    }
}