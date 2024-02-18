import java.util.*;

public class Main {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();
		if (in>0) a=in;
		else a=0;
		in = sc.nextInt();
		if (in<10) b=in;
		else b=0;
		
		System.out.println(a+b);
	}
}