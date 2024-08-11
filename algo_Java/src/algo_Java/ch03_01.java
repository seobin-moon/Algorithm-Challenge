package algo_Java;

import java.util.Scanner;

public class ch03_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int cnt = 0;
		int remain_coin = 0; // n을 coins[i]로 나눈 후의 나머지
		int [] coins = {500, 100, 50, 10}; 
		
		// n이 0이 될 때까지 반복
		while (n != 0) {
			for (int i = 0; i < coins.length; i++) { // coins 배열의 길이, 즉 500->100->50->10원 순으로 4번 반복
				cnt += n / coins[i]; // cnt에 n을 화폐 단위로 나눈 몫을 저장 ex) 1260 / 500 = 2를 cnt에 저장
				n %= coins[i]; // 나머지(n%coins[i])를 그 다음 화폐인 100원으로 나누기 위해 n에 저장
			}			
		}
		System.out.println(cnt+"개");
	}

}
