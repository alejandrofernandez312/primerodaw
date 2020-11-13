package first;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("¿Qué término de la serie fibonacci quieres?");
		int n = input.nextInt();
		
		System.out.println("Tu término "+ fibonacci(n));
		
	}
	
	public static int fibonacci(int n) {
		int a=0;
		int b=1;
		int c=0;
		if (n==1) return 0;
		if (n==2) return 1;
		for (int i=3;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
}
