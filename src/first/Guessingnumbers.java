package first;

import java.util.Scanner;

public class Guessingnumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int random = (int)(Math.random()*101);
		
		System.out.println("Número random: " + random);
		
		System.out.println("Escribe un número:");
		int answer = input.nextInt();
		
			while (answer != random) {
				if (answer > random) {
					System.out.println("Escribe un número más pequeño");
				}
				else {
					System.out.println("Escribe un número más grande");
				}
				answer = input.nextInt();
				
			}
			System.out.println("¡Enhorabuena, has acertado el número!");
		}
				
	}

