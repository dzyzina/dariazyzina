import java.util.Scanner;

public class Plus {
	public static void main(String[] args){
		int x;
		int y;
		int summa;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ������ �����");
		x = sc.nextInt();
		
		System.out.println("������� ������ �����");
		y = sc.nextInt();
		
		
		summa = x + y;
		System.out.println("�����" + summa);

	}

}