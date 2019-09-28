
import java.util.*;

public class E_2017_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a<b) { // 큰 수가 무조건 앞으로 와야함
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
			
			while (true) { // 계속 과정을 반복함
				int tmp = x;
				x = y;
				y = tmp%y;
				if (y==0) break;
			}

			return x;
		}
	
	}
}

// 단순히 재귀로 풀면 숫자가 매우 커졌을 때 스택이 너무 길어져 문제가 발생할 수 있움
