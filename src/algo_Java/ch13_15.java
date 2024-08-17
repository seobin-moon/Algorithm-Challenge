import java.util.*;
import java.io.*;

public class Main {

	static final int INF = -1; // infinity. 방문하지 않은 노드의 초기 거리 값

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 도시 개수
		int M = Integer.parseInt(st.nextToken()); // 도로 개수 
		int K = Integer.parseInt(st.nextToken()); // 거리 정보
		int X = Integer.parseInt(st.nextToken()); // 출발 도시 정보
		
		List<Integer>[] edges = new List[N+1]; // 각 도시(1~N)에 연결된 다른 도시 목록을 저장하기 위한 리스트 배열
		for (int i = 1; i <= N; i++) { 
			edges[i] = new ArrayList<>();  // 도시 간의 연결 관계를 저장하는 인접 리스트 배열
			// edges[i]는 도시 i에 연결된 다른 도시들의 리스트
		} 
		for (int i = 0; i < M; i++) { // M번만큼 A, B 입력받기
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken()); // 노드 A -> B로 도로(간선)가 존재
			int B = Integer.parseInt(st.nextToken());
			edges[A].add(B); // 도시 A에서 도시 B로의 도로가 있음을 기록
		}
		
		int[] dist = new int[N+1];  // 각 도시까지의 최단 거리를 저장하기 위한 배열
		Arrays.fill(dist, INF); // 모든 도시의 최단 거리 값을 초기화 (-1로 설정하여 방문하지 않음을 표시)
		Queue<Integer> q = new ArrayDeque<>(); // Queue<Integer> q = new ArrayList<>(); 보다 빠름
		// 단, 중간에 요소 삽입이 필요하다면 LinkedList 사용
		q.add(X); // 출발 도시 X를 큐에 추가하여 탐색을 시작
	    dist[X] = 0; 
	    
	    List<Integer> answer = new ArrayList<>(); // K 거리에 있는 도시를 저장하기 위한 리스트
		
	    // BFS 탐색 시작
	    while (!q.isEmpty()) {
	    	int cur = q.poll(); // 큐에서 현재 도시를 꺼내옴. poll : 큐의 최상위 요소(헤드)를 검색 및 제거
	    	if (dist[cur] > K) break; 
	    	if (dist[cur] == K) answer.add(cur);
	    	
	    	// 현재 도시에서 연결된 다른 도시들을 순회 
	    	for (int next : edges[cur]) { 
	    		if (dist[next] != INF) continue; // 이미 방문한 도시는 건너뜀 
	    		dist[next] = dist[cur]+1; // 다음 도시까지의 거리는 현재 도시까지의 거리 + 1
	    		q.add(next); // 다음 도시를 큐에 추가하여 탐색을 이어감 
	    	}
 	    }
	    
	    Collections.sort(answer);
	    StringBuilder sb = new StringBuilder(); 
	    for (int cur : answer) { 
	    	sb.append(cur).append('\n'); // 결과 리스트를 한 줄씩 StringBuilder에 추가
	    }
	    System.out.println(answer.isEmpty() ? -1 : sb);
	}
}
