import java.util.Scanner;

public class Stepen {
	public static void main(String[] args){
		int x;
		int y;
		int res = 1;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите первое число");
		x = sc.nextInt();
		
		System.out.println("Введите второе число");
		y = sc.nextInt();
		
		for (int i = 0; i< y; i ++){
			
			res *= x;
		}
		
		System.out.println("Ответ:" + res);

	}

}