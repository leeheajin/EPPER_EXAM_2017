import java.util.*;

public class E_2017_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt(); 
		int myA = A;
		int n = 1; // 계속 곱해질 수
		
		int digit[] = new int [10]; // 자리값을 저장하기 위한 변수
		int count = 0;
		
		while (count!=10) { // 모든 자리값을 구할 경우 자동으로 종료
			n ++;
			
			while (true) {

				if (digit[myA%10] != 1) {
					digit[myA%10] = 1;
					count ++;
				}
				myA = myA/10;
				if (myA==0) break;
			}
			
			myA = A*n;
		}
		
		System.out.println(n-1);
	}

}
