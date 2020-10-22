package first;

import java.util.Scanner;

public class AdvancedMathv2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int cont = 0;
		int bien = 0;
		while (cont<5) {
			int n1 = (int)(Math.random()*10);
			int n2 = (int)(Math.random()*10);
		
		
			if (n1>n2) {
			int answer = n1 - n2;
			System.out.println("¿Cuánto es " + n1 + "-" + n2 + "?");
			int answer2 = input.nextInt();
			while (answer2 != answer) {
				System.out.println("Respuesta incorrecta, vuelve a responder");
				System.out.println("¿Cuánto es " + n1 + "-" + n2 + "?");
				answer2 = input.nextInt();
			}
			System.out.println("Has acertado");
			cont++;
			
			}
			else {
			System.out.println("¿Cuánto es " + n2 + "-" + n1 + "?");
			int answer = n2 - n1;
			int answer2 = input.nextInt();
			while (answer2 != answer) {
				System.out.println("Respuesta incorrecta, vuelve a responder");
				System.out.println("¿Cuánto es " + n2 + "-" + n1 + "?");
				answer2 = input.nextInt();
			}
			System.out.println("Has acertado");
			cont++;
		}
	}
}
}
