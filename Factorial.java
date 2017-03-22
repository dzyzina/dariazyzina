import java.util.Scanner;

public class Factorial {
	
	public static int rec(int n) {
        
        if (n == 1) {
            return 1;          
        }
     
        return rec(n - 1) * n;
    }
	
	public static void main(String[] args){
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число");
		x = sc.nextInt();	
		
		System.out.println("Ответ:" + rec(x));

	}

}