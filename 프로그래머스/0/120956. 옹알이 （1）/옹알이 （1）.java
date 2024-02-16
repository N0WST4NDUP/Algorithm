class Solution {
    public int solution(String[] babbling) {
        String[] cuteBaby = {"aya","ye","woo","ma"};
        int count = 0;
        for (String babble : babbling) {
        	for (String cuteSound : cuteBaby) {
        		babble = babble.replace(cuteSound, ".");
        	}
        	babble = babble.replace(".", "");
        	if (babble.length() == 0) count++;
        }
		
        return count;
    }
}