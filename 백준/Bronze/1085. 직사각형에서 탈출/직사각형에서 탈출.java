import java.io.*;
import java.util.*;

public class Main {
	static int x, y, w, h; // 현재의 위치 좌표, 직사각형의 오른쪽 위 꼭짓점 좌표

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());		
		
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		int a = Math.min(x, y);
		int b = Math.min(w-x, h-y);
		int result = Math.min(a, b);
		
		System.out.println(result);

	}

}
