import java.util.Scanner;

public class Stepen {
	public static void main(String[] args){
		int x;
		int y;
		int res = 1;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ������ �����");
		x = sc.nextInt();
		
		System.out.println("������� ������ �����");
		y = sc.nextInt();
		
		for (int i = 0; i< y; i ++){
			
			res *= x;
		}
		
		System.out.println("�����:" + res);

	}

}