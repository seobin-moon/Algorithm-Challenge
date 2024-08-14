package algo_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ch11_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 한 줄의 문자열을 읽는다
		int[] x = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine()); // 입력 받은 문자열을 공백 기준으로 나누기
		
		int cnt = 0; 
		int maxGroup = 0; // 최대 그룹 수 
		
		for (int i = 0; i < n; i ++) {
			x[i] = Integer.parseInt(st.nextToken()); // 공포도 x를 배열에 저장
		} 
		
		Arrays.sort(x); // 오름차순 정렬
		
		for (int j = 0; j < n; j++) {
			cnt += 1;
			if (cnt >= x[j]) { // 현재 그룹에 포함된 인원 수(cnt)가 현재 확인하고 있는 공포도(x[j])이상이라면 그룹 결성
				maxGroup += 1;
				cnt = 0;
			}
			
		}
		
		System.out.println(maxGroup);
	}
	
}
