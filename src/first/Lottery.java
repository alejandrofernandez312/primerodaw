package First;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
		int number = (int) (Math.random()*100);
		
		System.out.println("Elija un número del 0-99:");
		int user = input.nextInt();
		
		int number1 = number / 100;
		int number2 = number % 100;
		
		int user1 = user / 100;
		int user2 = user % 100;
		
		if (number == user) {
			System.out.println("Tu número: " + user);
			System.out.println("Número ganador: " + number);
			System.out.println("¡Enhorabuena, has ganado $10,000");
		}
		
		else 
			
			if ((number1==user2) && (number2==user1)){
				System.out.println("Tu número: " + user);
				System.out.println("Número ganador: " + number);
				System.out.println("¡Enhorabuena, has ganado $3,000");
		}
			else
				if ((number1==user1) || (number1==user2) || (number2==user2)) {
					System.out.println("Tu número: " + user);
					System.out.println("Número ganador: " + number);
					System.out.println("¡Enhorabuena, has ganado $1,000");
			}
	

	}
}
