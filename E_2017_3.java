import java.util.*;

public class E_2017_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		String str = Integer.toString(n);
		
		for (int i=0; i<str.length()/2; i++) { // �߰������� �պ��� �ڱ��� ���ϸ� ��
			if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
				System.out.println("No");
				return;
			}
		}
		
		System.out.println("yes");

	}

}
