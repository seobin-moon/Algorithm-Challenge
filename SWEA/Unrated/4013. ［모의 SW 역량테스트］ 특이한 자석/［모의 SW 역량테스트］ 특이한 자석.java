import java.util.*;
import java.io.*;

// magnet[1]의 값이 1이면(S극) 점수 획득
// 1번째 톱니바퀴 : 1점(2^0), 2번째 : 2점(2^1), 3번째 : 4점(2^2), 4번째 : 8점(2^3)
public class Solution {
	static int K;
	static int score; // 회전이 끝난 후 획득 점수
	static int[][] magnet;
	static int[] rotate;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			score = 0;
			K = Integer.parseInt(br.readLine());
			magnet = new int[5][8]; // 1~4번까지의 N극, S극 저장
			rotate = new int[5]; // 1~4번의 회전 방향 (0 : 회전x, -1 : 반시계, 1 : 시계)
			for (int i = 1; i < 5; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 8; j++) {
					magnet[i][j] = Integer.parseInt(st.nextToken());
				}
			} // 1~4번 각 자석들의 자성 정보 입력 완료

			for (int i = 0; i < K; i++) { // K개의 줄에 자석을 1칸씩 회전시키는 회전 정보 입력
				StringTokenizer st = new StringTokenizer(br.readLine());
				int num = Integer.parseInt(st.nextToken()); // num번째 자석을 dir방향으로 회전
				int dir = Integer.parseInt(st.nextToken()); // -1, 0, 1
				rotate[num] = dir; // 3 1 : 3번 자석을 시계방향으로 회전
				// 입력 끝
				setRotLeft(num - 1); // num 기준 좌측으로 회전방향 세팅 // ??
				setRotRight(num + 1); // num 기준 우측으로 회전방향 세팅 // ??
				moveMagnet(); // 각 톱니바퀴들을 회전방향에 맞게 회전 // ??
			}

			for (int i = 1; i < 5; i++) {
				if (magnet[i][0] == 1)
					score += Math.pow(2, i - 1);
			}
			System.out.println("#" + tc + " " + score);
		}
	}

	private static void moveMagnet() {
		for (int i = 1; i < 5; i++) {
			int dir = rotate[i];
			if (dir == 0) { // 회전하지 않으면
				continue;
			} else if (dir == 1) {
				magnet = circle(i, magnet); // i번째 톱니바퀴 시계방향으로 회전
			} else if (dir == -1) { //
				magnet = reverseCircle(i, magnet); // i번째 톱니바퀴 반시계방향으로 회전
			}
		}
	}

	private static int[][] reverseCircle(int num, int[][] magnet) { // 반시계 방향 회전
		int data[] = copy(magnet[num]);
		for (int i = 0; i < 8; i++) {
			magnet[num][i] = data[(i + 1 + 8) % 8]; // ??
		}
		return magnet;
	}

	private static int[][] circle(int num, int[][] magnet) { // 시계 방향 회전
		int data[] = copy(magnet[num]);
		for (int i = 0; i < 8; i++) {
			magnet[num][i] = data[(i - 1 + 8) % 8]; //??
		}
		return magnet;
	}

	private static int[] copy(int[] arr) { // 배열 복사
		int[] tmp = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			tmp[i] = arr[i];
		return tmp;
	}

	private static void setRotLeft(int num) { // 기준 자석의 왼쪽 자석들에 대해 회전 방향을 결정
		if (num == 0)
			return;
		// num의 2번과 num+1의 6번 비교 (3과 7 비교)
		if (rotate[num + 1] == 0) {
			rotate[num] = 0;
		} else if (magnet[num][2] == magnet[num + 1][6]) {
			rotate[num] = 0;
		} else {
			rotate[num] = rotate[num + 1] == -1 ? 1 : -1; // 반대 방향 회전
		}
		setRotLeft(num - 1);

	}

	private static void setRotRight(int num) { // 기준 자석의 오른쪽 자석들에 대해 회전 방향을 결정
		if (num > 4)
			return;

		// num-1의 2번과 num의 6번 비교
		if (rotate[num - 1] == 0) // 이전 자석이 회전하지 않으면 자신도 회전하지 않음
			rotate[num] = 0;
		else if (magnet[num - 1][2] == magnet[num][6]) { // 자성이 같을 경우 회전 X
			rotate[num] = 0;
		} else {
			rotate[num] = rotate[num - 1] == -1 ? 1 : -1; // 반대 방향 회전
		}
		setRotRight(num + 1);

	}
}