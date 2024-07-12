import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        String[] onlyNum = my_string.replaceAll("[a-zA-Z]", " ").replaceAll(" +", " ").trim().split(" ");
        if (onlyNum[0].equals("")) return 0;
        return Arrays.stream(onlyNum).mapToInt(Integer::parseInt).sum();
    }
}