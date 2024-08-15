package algo_Java;

import java.io.*;

public class ch05_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int i = 0, j = 0, cnt = 1, result = 0;
        int[][] arr = new int[N][M]; // N*M 배열 생성

        // 배열에 값 채워넣기 (예: 사용자 입력 받기)
        for (int x = 0; x < N; x++) {
            String line = br.readLine(); // 한 줄의 문자열 입력받기
            for (int y = 0; y < M; y++) {
                arr[x][y] = line.charAt(y) - '0'; // 각 문자를 숫자로 변환하여 배열에 저장
            }
        }

        // 배열 탐색 (이 부분은 구체적인 문제에 따라 달라질 수 있음)
        while (i < N && j < M) {
            if (j + 1 < M && arr[i][j + 1] == 1) { // 오른쪽으로 이동
                j++;
                cnt++;
            } else if (i + 1 < N && arr[i + 1][j] == 1) { // 아래쪽으로 이동
                i++;
                cnt++;
            } else {
                break; // 이동할 수 없으면 종료
            }
        }

        result = cnt; // cnt 값을 결과로 사용
        System.out.println(result);
    }
}
