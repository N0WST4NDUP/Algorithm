class Solution {
    public String solution(String[] survey, int[] choices) {
        for (int i=0; i<survey.length; i++) {
            String[] splt = survey[i].split("");
            if (choices[i]-4<0) Mbti.valueOf(splt[0]).setValue(4-choices[i]);
            else Mbti.valueOf(splt[1]).setValue(choices[i]-4);
        }
        return Mbti.getMbti();
    }
}

enum Mbti {
    R(0),
    T(0),
    C(0),
    F(0),
    J(0),
    M(0),
    A(0),
    N(0);
    
    private int value;
    
    Mbti(int value) {
        this.value = value;
    }
    
    int getValue() {return value;}
    
    void setValue(int point) {value += point;}
    
    static String getMbti() {
        StringBuilder sb = new StringBuilder();
        Mbti[] arr = Mbti.values();
        for (int i=0; i<arr.length; i+=2) {
            if (arr[i].getValue()>=arr[i+1].getValue()) sb.append(arr[i]);
            else sb.append(arr[i+1]);
        }
        return sb.toString();
    }
}