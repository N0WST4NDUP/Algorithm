import java.util.*;

class Solution {
    public String solution(String s) {
        return s.chars()
                .mapToObj(c -> (char)c)
                .sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new,
                         StringBuilder::append,
                         StringBuilder::append)
                .toString();
    }
}