import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] answers) {
        int[] firstMan = {1,2,3,4,5};
        int[] secondMan = {2,1,2,3,2,4,2,5};
        int[] thirdMan = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];
        int topScore;
        for (int i=0; i<answers.length; i++) {
            if (firstMan[i%firstMan.length] == answers[i]) score[0]++;
            if (secondMan[i%secondMan.length] == answers[i]) score[1]++;
            if (thirdMan[i%thirdMan.length] == answers[i]) score[2]++;
        }
        topScore = Arrays.stream(score).max().getAsInt();
        return IntStream.range(0,3).filter(idx -> score[idx] == topScore).map(i -> i+1).toArray();
    }
}