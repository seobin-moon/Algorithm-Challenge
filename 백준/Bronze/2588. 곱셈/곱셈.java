import java.io.*;
import java.util.*;

public class Main {
	static int a, b;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		
		int operate1 = a * (b%10);
		int operate2 = a * (((b%100) - (b%10)) / 10); // 385 -> (85 - 5) / 10 
		int operate3 = a * (b/100);
		int operate4 = operate1 + (operate2 * 10) + (operate3 * 100);
		
		System.out.println(operate1);
		System.out.println(operate2);
		System.out.println(operate3);
		System.out.println(operate4);
	}
}
