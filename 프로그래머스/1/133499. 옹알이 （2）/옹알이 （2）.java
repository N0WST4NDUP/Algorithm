class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (String babble : babbling) {
            if (babble.contains(words[0].repeat(2)) ||
                babble.contains(words[1].repeat(2)) ||
                babble.contains(words[2].repeat(2)) ||
                babble.contains(words[3].repeat(2))) continue;
            
            for (String word : words) {
                babble = babble.replace(word, ".");
            }
            babble = babble.replace(".", "");
            
            if (babble.length() <= 0) answer++;
        }
        return answer;
    }
}