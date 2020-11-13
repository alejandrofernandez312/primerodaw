package first;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int a=0;
		int b=1;
		
		for (int i=1;i<=10;i++) {
			System.out.println(a + " "+ b + " " + (a+b));
			a=a+b;
			b=a+b;
		}

	}

}
