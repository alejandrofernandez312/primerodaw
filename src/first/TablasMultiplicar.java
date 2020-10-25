package first;

import java.util.Scanner;

public class TablasMultiplicar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("¿Qué tabla quieres saber?");
		int number = input.nextInt();
		
		
			for (int i=1; i<=10; i++) {
		System.out.println(i + "x" + number + "=" + number*i);
	}
			
	}
}
