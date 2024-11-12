import java.io.*;
import java.util.*;

public class Main {
	static int N, M;
	static int[] selected;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		selected = new int[M]; // M개의 숫자를 선택하여 저장할 배열
		visited = new boolean[N + 1]; // 중복 체크 배열 

		backtrack(0); // depth = 0부터 시작

	}

	public static void backtrack(int depth) {
		if (depth == M) { // 기저 조건
			for (int num : selected) {
				System.out.println(num);
			}
			return;
		}
		
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				visited[i] = true; // 숫자i를 선택
				selected[depth] = i; // 현재 depth에 숫자 저장
				backtrack(depth + 1); 
				visited[i] = false; // 숫자 i선택해제 (백트래킹)
			}
		}
	}
}
