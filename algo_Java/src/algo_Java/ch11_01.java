package algo_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ch11_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // �� ���� ���ڿ��� �д´�
		int[] x = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine()); // �Է� ���� ���ڿ��� ���� �������� ������
		
		int cnt = 0; 
		int maxGroup = 0; // �ִ� �׷� �� 
		
		for (int i = 0; i < n; i ++) {
			x[i] = Integer.parseInt(st.nextToken()); // ������ x�� �迭�� ����
		} 
		
		Arrays.sort(x); // �������� ����
		
		for (int j = 0; j < n; j++) {
			cnt += 1;
			if (cnt >= x[j]) { // ���� �׷쿡 ���Ե� �ο� ��(cnt)�� ���� Ȯ���ϰ� �ִ� ������(x[j])�̻��̶�� �׷� �Ἲ
				maxGroup += 1;
				cnt = 0;
			}
			
		}
		
		System.out.println(maxGroup);
	}
	
}
