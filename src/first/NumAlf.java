package first;

import java.util.Scanner;

public class NumAlf {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
System.out.println("Introduzca una nota:");
		int note = input.nextInt();
		
		if (note > 10) 
			System.out.println("Nota no válida");	
		else 
			if (note < 0) 
					System.out.println("Nota no válida");
			else //si no es < 0
				if (note < 5)
					System.out.println("¡Has sacado un insuficiente!");
				else
					if (note < 6)
						System.out.println("¡Has sacado un suficiente!");
					else
						if (note < 7)
							System.out.println("¡Has sacado un bien!");
						else
							if (note < 9)
								System.out.println("¡Has sacado un notable!");
							else
								if (note <= 10)
									System.out.println("¡Has sacado un sobresaliente!");
			
		
	}

}
