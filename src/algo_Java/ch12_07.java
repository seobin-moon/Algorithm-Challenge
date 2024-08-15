package algo_Java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.nextLine();
 
        char[] arr = s.toCharArray();
        String result = "READY";
        
        int a = 0;
        int b = 0;
        
        //문자열의 왼쪽(a), 오른쪽(b) 절반씩의 합을 계산
        for (int i = 0; i < arr.length / 2; i++) {
            a += arr[i] - '0';
            b += arr[arr.length - 1 - i] - '0';
        }
        // 절반의 합이 같은 경우 "LUCKY"로 변경
        if (a == b) {
            result = "LUCKY";
        }
        
        System.out.println(result);
    }
}





