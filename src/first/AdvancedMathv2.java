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
			int answer = n1 - n2;
		
			if (n1>n2) {
			System.out.println("¿Cuánto es " + n1 + "-" + n2 + "?");
			int answer2 = input.nextInt();
				if (answer2 == answer) {
					System.out.println("¡Has acertado!");
					++bien;
				}
				
				else {
					while (answer2 != answer) {
						System.out.println("Has fallado, vuelve a responder");
						if (answer2 == answer) {
							System.out.println("¡Has acertado!");
						}
			else{
				System.out.println("¿Cuánto es " + n2 + "-" + n1 + "?");
				answer = n2-n1;
			    answer2 = input.nextInt();
				if (answer2 == answer) {
					System.out.println("¡Has acertado!");
					++bien;
				}
				else {
					while (answer2 != answer) {
						System.out.println("Has fallado, vuelve a responder");
						if (answer2 == answer) {
							System.out.println("¡Has acertado!");				
							
						}
					else{
						System.out.println("¿Cuánto es " + n2 + "-" + n1 + "?");
						answer = n2-n1;
					    answer2 = input.nextInt();
						if (answer2 == answer) {
							System.out.println("¡Has acertado!");
							
						}
					}
				}
			}
			cont++;
			
			}
					}
				}
			}
		}
	}
}
		
