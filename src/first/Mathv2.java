package first;

import java.util.Scanner;

public class Mathv2 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner (System.in);
		
		int n1 = (int)(Math.random()*10);
		int n2 = (int)(Math.random()*10);
		
		System.out.println(n1 + "-" + n2);
		
		if (n1 > n2) {
			System.out.println("¿Cuánto es " + n1 + "-" + n2 + "?");
			int answer = n1 - n2;
			int answer2 = input.nextInt();
			if (answer2 == answer) {
				System.out.println("¡Muy bien!");
			}
			else {
				while (answer2 != answer) {
					System.out.println("Respuesta incorrecta. Vuelve a intentarlo:");
					System.out.println("¿Cuánto es " + n1 + "-" + n2 + "?");
					answer2 = input.nextInt();
				}
				System.out.println("¡Respuesta correcta!");
			}
		}
		
		else {
			System.out.println("¿Cuánto es " + n2 + "-" + n1 + "?");
			int answer = n2 - n1;
			int answer2 = input.nextInt();
			if (answer2 == answer) {
				System.out.println("¡Muy bien!");
			}
			else {
				while (answer2 != answer) {
					System.out.println("Respuesta incorrecta. Vuelve a intentarlo:");
					System.out.println("¿Cuánto es " + n2 + "-" + n1 + "?");
					answer2 = input.nextInt();
				}
				System.out.println("¡Respuesta correcta!");
			}
		}
	}
			
}
