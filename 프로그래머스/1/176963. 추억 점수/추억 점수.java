import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for (int i=0; i<photo.length; i++) {
            List<String> list = Arrays.asList(photo[i]);
            int count = 0;
            for (int j=0; j<name.length; j++) {
                if (list.contains(name[j]))
                    count += yearning[j];
            }
            answer[i] = count;
        }
        return answer;
    }
}