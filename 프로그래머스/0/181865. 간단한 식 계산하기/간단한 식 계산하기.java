class Solution {
    public int solution(String binomial) {
        String[] splt = binomial.split(" ");
        switch (splt[1]) {
            case "+":
                return Integer.parseInt(splt[0])+Integer.parseInt(splt[2]);
            case "-":
                return Integer.parseInt(splt[0])-Integer.parseInt(splt[2]);
            case "*":
                return Integer.parseInt(splt[0])*Integer.parseInt(splt[2]);
            default :
                return -1;
        }
    }
}