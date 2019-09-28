import java.util.Scanner;

public class E_2017_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		
		char bomb[][] = new char[m][n];
		String answer[][] = new String[m][n];
		
		for (int i=0; i<m; i++) { // �� �پ� �Է¹޾Ƽ� char�迭�� ���� ����
			String str = sc.next();
			bomb[i]=str.toCharArray();
		}
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				
				if (bomb[i][j]=='*') { // ��ź �� ��� ����� �ʿ䰡 ����
					answer[i][j] = "*";
					System.out.print(answer[i][j].toString());
					continue; 
				}
				
				else {
					int count = 0; // ��ź�� ���� ���� ���� ����
					int x,y,xx,yy; // Ž�� �� ������ ���ϴ� ������
					
					if (i<=1) x=0;
					else x=i-1;
					
					if (i==m-1) xx=i;
					else xx=i+1;
					
					if (j<=1) y=0;
					else y=j-1;
					
					if (j==n-1) yy=j;
					else yy=j+1;
					
					for (int a=x; a<=xx; a++) {
						for (int b=y; b<=yy; b++) {
							if (bomb[a][b]=='*') count++;
						}
					}
					
					answer[i][j]=Integer.toString(count);
				}
				System.out.print(answer[i][j].toString());
			}
			System.out.println();
		}
		
	
		
	}
	

}
