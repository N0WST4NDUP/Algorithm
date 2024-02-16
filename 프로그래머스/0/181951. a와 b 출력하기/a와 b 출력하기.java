import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= -100000)
            System.out.println("a = " + a);
        if (b <= 100000)
            System.out.println("b = " + b);
    }
}