package algo_Java;

import java.util.Scanner;

public class ch11_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] weights = new int[N];
        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
        }
        
        int cnt = 0;

        // 유효한 볼링공 조합 구하고 cnt 증가
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (weights[i] != weights[j]) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
        sc.close(); // 이제까지 close 안했는데.. 왜 해야 하지?
    }
}
