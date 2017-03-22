import java.util.Scanner;

public class Plus {
	public static void main(String[] args){
		int x;
		int y;
		int summa;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите первое число");
		x = sc.nextInt();
		
		System.out.println("Введите второе число");
		y = sc.nextInt();
		
		
		summa = x + y;
		System.out.println("Ответ" + summa);

	}

}