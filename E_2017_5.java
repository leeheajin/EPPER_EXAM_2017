import java.util.*;

public class E_2017_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt(); // ���� ����
		int count = 0;
		
		if (n%2!=0) { // ������ �������� �ʴ� ���
			for (int i=n/2; i>0; i--) {
				for (int j=i; j>0; j--) {
					for (int k=j; k>0; k--) {
						if (i+j+k==n) count ++;
					}
				}
			}
		}
		
		else { // �������� ������ �������� ���
			for (int i=n/2-1; i>0; i--) {
				for (int j=i; j>0; j--) {
					for (int k=j; k>0; k--) {
						if (i+j+k==n) count ++;
					}
				}
			}
		}
		
		System.out.println(count);
	}

}
