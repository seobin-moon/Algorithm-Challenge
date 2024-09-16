import java.io.*;
import java.util.*;

public class Main {
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		// factorial은 n이 자연수일때, 1부터 n까지의 모든 자연수의 곱을 의미
		// 4! = 4 * 3!
		// 3! = 3 * 2!
		// 2! = 2 * 1!
		// 1! = 1
			
		factorial(N);
		System.out.println(factorial(N));
		
	}
//	public static void factorial(int n) {
//		if (n > 1) {
//			result = n * factorial(n-1);
//		}
//		else {
//			result = 1;
//		}
//	}
	
	public static int factorial(int n) {
		if (n > 1) {
			return n * factorial(n-1);
		}
		else {
			return 1;
		}
	}
	
//	public static void factorial3(int n) {
//		if (n > 1) {
//			factorial3(n - 1);
//			result *= n;
//		}
//		else {
//			result = 1;
//		}
//	}
}
