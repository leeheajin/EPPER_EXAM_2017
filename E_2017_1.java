
import java.util.*;

public class E_2017_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a<b) { // ū ���� ������ ������ �;���
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		System.out.println(math(a,b));
	}

	public static int math(int a, int b) {
		
		if (b==0) return a;
		
		else {
			int x = a;
			int y = b;
			
			while (true) { // ��� ������ �ݺ���
				int tmp = x;
				x = y;
				y = tmp%y;
				if (y==0) break;
			}

			return x;
		}
	
	}
}

// �ܼ��� ��ͷ� Ǯ�� ���ڰ� �ſ� Ŀ���� �� ������ �ʹ� ����� ������ �߻��� �� �ֿ�
