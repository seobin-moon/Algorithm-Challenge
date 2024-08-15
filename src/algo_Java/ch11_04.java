package algo_Java;

import java.util.Arrays;
import java.util.Scanner;

public class ch11_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// N 입력 받기
		int N = sc.nextInt();

		// 동전 입력받기
		int[] coins = new int[N];
		for (int i = 0; i < N; i++) {
			coins[i] = sc.nextInt();
		}

		// coins를 오름차순 정렬
		Arrays.sort(coins);

		// 만들 수 없는 최소 금액 min을 1로 초기화 (조건)
		int min = 1;

		for (int i = 0; i < N; i++) {
			// 현재 값이 min보다 크면 멈추기 
			// 현재 값이 min보다 작거나 같으면 현재 값을 min에 더하기
			if (coins[i] > min) {
				break;
			}
			min += coins[i];
		}
		System.out.println(min);
	}
}
