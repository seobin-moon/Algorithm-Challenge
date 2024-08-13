package algo_Java;

import java.util.*;
import java.io.*;

public class ch04_02 {

    // 나이트의 이동 방향을 정의한 배열 (x축, y축 이동)
    static int dx[] = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int dy[] = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String args[]) throws IOException {

        // 입력을 위한 BufferedReader와 출력을 위한 BufferedWriter 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 체스판의 특정 위치를 나타내는 문자열 입력 받기 (ex. "a1")
        String str = br.readLine();

        // 행(row) 값 (문자 '1' ~ '8'을 숫자로 변환)
        int row = str.charAt(1) - '0';
        // 열(column) 값 (문자 'a' ~ 'h'를 숫자로 변환, a를 1로, b를 2로)
        int column = str.charAt(0) - 'a' + 1;

        int count = 0;

        // 나이트의 8가지 이동 방향에 대해 하나씩 검사
        for (int i = 0; i < 8; i++) {
            // 나이트가 이동한 후의 새로운 위치 계산
            int resultRow = row + dx[i];
            int resultColumn = column + dy[i];

            // 새 위치가 체스판 안에 있는지 확인 (1 <= row, column <= 8)
            if (resultRow >= 1 && resultRow <= 8 && resultColumn >= 1 && resultColumn <= 8)
                count++; 
        }
        bw.write(String.valueOf(count));

        // 입력과 출력 스트림 닫기
        br.close();
        bw.close();
    }
}
