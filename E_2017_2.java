import java.util.Scanner;

public class E_2017_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		String str = sc.next();
		
		int count = 0;
		int score = 0;
		
		char answer[] = str.toCharArray();
		
		for (int i=0; i<answer.length; i++) {
			if (answer[i]=='O') {
				count++;
				score += count;
			}
			else count = 0;
		}

		System.out.println(score);
	}

}
