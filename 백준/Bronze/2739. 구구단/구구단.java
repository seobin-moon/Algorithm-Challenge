import java.io.*;
import java.util.*;

public class Main {
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i < 10; i ++) {
			System.out.println(N + " * " + i + " = " + N * i);
		}
	}

}
