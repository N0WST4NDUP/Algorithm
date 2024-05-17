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
		System.out.println(dynamicFibo2(n));
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
	//TopDown (recursive)
	//in -> 30
	//out -> 832040
	//time -> 81700ns
	static int dynamicFibo1(int x) {
		if (x == 2 || x == 1) return 1;
		if (dp[x] != 0) return dp[x];
		dp[x] = dynamicFibo1(x-2) + dynamicFibo1(x-1);
		return dp[x];
	}
	//BottomUp (loop)(for or while)
	//in -> 30
	//out -> 832040
	//time -> 81200ns
	static int dynamicFibo2(int x) {
		int idx = 1;
		dp[idx++] = 1;
		dp[idx++] = 1;
		while (idx <= x) {
			dp[idx] = dp[idx-2] + dp[idx-1];
			idx++;
		}
		return dp[x];
	}
}
