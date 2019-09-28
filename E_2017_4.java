import java.util.Scanner;

public class E_2017_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int C = sc.nextInt(); // �մ��� ������ ���
		int M = sc.nextInt(); // ������ ���
		
		int change = C-M; // �ܵ�
		int count = 0; // �Ž����ִ� ������ ��
		
		int money[] = {500, 100, 50, 10, 5, 1}; // ������ �ִ� ������ ����
		
		for (int i=0; i<6; i++) {
			
			if (change==0) break; // �� �̻� �Ž����� �ʿ䰡 ����
			
			if (change/money[i]==0) { // �ش� �ݾ����� �Ž��� �� ������ ���
				continue;
			}
			
			else {
				int how;
				how = change/money[i]; // ��� �Ž��� �� �� �ִ°�
				count += how;
				change -= how*money[i]; // �ش� �ݾ׸�ŭ �ܵ��� ���
			}
			
		}
		
		System.out.println(count);
	}

}
