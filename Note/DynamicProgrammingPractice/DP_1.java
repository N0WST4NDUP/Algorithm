package dynamic_programming;

import java.util.Scanner;

public class DP_1 {
	static int[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		dp = new int[n+1];
		long start = System.nanoTime();
		System.out.println(dynamicFibo(n));
		System.out.println("걸린 시간 : " + (System.nanoTime()-start) + "ns");
		sc.close();
	}
	
	//in -> 30
	//out -> 832040
	//time -> 5202400ns
	static int fibo(int x) {
		if (x == 2 || x == 1) return 1;
		return fibo(x-2) + fibo(x-1);
	}
	//in -> 30
	//out -> 832040
	//time -> 81700ns
	static int dynamicFibo(int x) {
		if (x == 2 || x == 1) return 1;
		if (dp[x] != 0) return dp[x];
		dp[x] = dynamicFibo(x-2) + dynamicFibo(x-1);
		return dp[x];
	}
}
