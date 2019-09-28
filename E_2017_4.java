import java.util.Scanner;

public class E_2017_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int C = sc.nextInt(); // 손님이 지불한 비용
		int M = sc.nextInt(); // 물건의 비용
		
		int change = C-M; // 잔돈
		int count = 0; // 거슬러주는 동전의 수
		
		int money[] = {500, 100, 50, 10, 5, 1}; // 가지고 있는 동전의 종류
		
		for (int i=0; i<6; i++) {
			
			if (change==0) break; // 더 이상 거슬러줄 필요가 없음
			
			if (change/money[i]==0) { // 해당 금액으로 거슬러 줄 수없는 경우
				continue;
			}
			
			else {
				int how;
				how = change/money[i]; // 몇개를 거슬러 줄 수 있는가
				count += how;
				change -= how*money[i]; // 해당 금액만큼 잔돈을 계산
			}
			
		}
		
		System.out.println(count);
	}

}
