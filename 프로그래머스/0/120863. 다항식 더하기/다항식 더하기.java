class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String strArr[] = polynomial.split(" ");
        int checkX = 0;
        int constant = 0;
        String str1 = "";
        String str2 = "";

        for ( int i = 0 ; i < strArr.length ; i++ ) {

            if ( strArr[i].contains("x") ) {

              checkX += strArr[i].replace("x","") != "" ? Integer.parseInt(strArr[i].replace("x","")) : 1 ;

            } else if ( !strArr[i].equals("+")) {

                constant += Integer.parseInt(strArr[i]);

            }
        }

        str1 = checkX >= 2 ? String.valueOf(checkX)+"x" : (checkX == 1 ? "x" : "");
        str2 = constant > 0 ? (str1.equals("") ? String.valueOf(constant) : " + "+String.valueOf(constant)) : "";
        answer = str1 + str2 ;
        return answer;
    }
}