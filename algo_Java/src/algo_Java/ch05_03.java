package algo_Java;

import java.util.*;
import java.io.*;

public class ch05_03 {

    static int n;  
    static int m;  
    static int graph[][];  


    public static boolean dfs(int x, int y) {
        if (x < 0 || x >= n || y < 0 || y >= m)
            return false;

        // 현재 노드를 아직 방문하지 않았다면
        if (graph[x][y] == 0) {
            graph[x][y] = 1; // 방문 처리

            // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출하여 방문 처리
            dfs(x - 1, y);
            dfs(x + 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);

            return true; 
        }
        return false;  // 이미 방문한 노드이므로, 더 이상 탐색할 필요 없음
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';  // 입력된 문자열을 숫자로 변환하여 그래프에 저장
            }
        }

        int result = 0; 

        // 2차원 배열의 모든 위치 탐색
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 현재 위치에서 DFS를 수행했을 때, 새로운 덩어리를 발견했다면
                if (dfs(i, j) == true)
                    result++;  // 덩어리 수 증가
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}
