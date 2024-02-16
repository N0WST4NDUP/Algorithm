import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(method(a));
        sc.close();
    }
    
    public static String method(String input) {
    	String output = "";
    	for (int i = 0; i<input.length(); i++) {
        	int temp = input.charAt(i);
        	if (65<=temp && temp<=90) {
        		output += (char)(temp+32);
        	} else if (97<=temp && temp<=122) {
        		output += (char)(temp-32);
        	}
        }
    	return output;
    }
}