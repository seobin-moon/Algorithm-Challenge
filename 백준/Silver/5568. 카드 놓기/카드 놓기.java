import java.io.*;
import java.util.*;

public class Main {
	static int N, k;
	static String[] card, output; // char로 받으면 한자리수밖에 못받음
	static HashSet<String> result;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		card = new String[N];
		output = new String[k];
		result = new HashSet<>(); // hashset은 길이가 정해지지 않음
		visited = new boolean[N];

		for (int i = 0; i < N; i++) {
			card[i] = br.readLine();
		}
		// 입력 끝

		// 중복은 없고, 순서는 고려 -> 순열 nPk (X)
		// hashset 사용
		// 1) 순열 구하기
		// 2) 중복 제거

		permutation(0);
		System.out.println(result.size());
	}

	public static void permutation(int depth) { // 함수 호출할 때 써야할 값들을 인자로 지정
		String s = ""; // 문자열 초기화
		if (depth == k) {
			for (int i = 0; i < k; i++) {
				s += output[i];
			} // String형 변수 s에 k개의 문자열이 담겨있는 output을 반복문을 통해 더해줌. 즉, 문자열 붙이기
			result.add(s); // hashset은 배열 타입을 가질 수 없음. 따라서 원시값인 String형으로 변환해서 넣어줌
			return;
		}

		for (int i = 0; i < N; i++) {
			if (visited[i] != true) {
				visited[i] = true;
				output[depth] = card[i]; // ??
				permutation(depth + 1);
				visited[i] = false; // 조합을 구한 후에는 다시 해당 카드를 false처리 해줘야 하나?
			}
		}
	}

}
