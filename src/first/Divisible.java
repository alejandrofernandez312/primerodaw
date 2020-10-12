package First;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Escribe el número:");
		int numero = input.nextInt();
		
		if ((numero % 2 == 0) && (numero % 3 == 0)) {
			System.out.println(numero + " es divisible entre 2 y 3.");
		}
		
		else
			if ((numero % 2 == 0) || (numero % 3 == 0)) {
				System.out.println(numero + " es divisible entre 2 o 3.");
				
			}
			else
				if ((numero % 2 == 0) ^ (numero % 3 == 0)) {
					System.out.println(numero + " es divisible entre 2 exclusive or 3.");
					
				}

		
	}

}
