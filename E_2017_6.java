import java.util.*;

public class E_2017_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt(); 
		int myA = A;
		int n = 1; // ��� ������ ��
		
		int digit[] = new int [10]; // �ڸ����� �����ϱ� ���� ����
		int count = 0;
		
		while (count!=10) { // ��� �ڸ����� ���� ��� �ڵ����� ����
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
