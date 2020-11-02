package First;

import java.util.Scanner;

public class OcurrenceMax {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int max = 0;
		int count = 1;
		String report = " ";
		int x = 1;
		
		while (x!=0) {
			System.out.println("Escribe un número: ");
			int number = input.nextInt();
			
			while (number>0) {
				report += " "+ number;
				System.out.println(report);
				if (number == max) {
					count++;
				}
				if (number > max) {
					max = number;
					count = 1;
				}
				
				break;
				
				}
			
			if (number == 0) {
				x=0;
			}
				
		}
		
			System.out.println(report + " 0");
			System.out.println("El número máximo es " + max + " y se ha repetido " + count + " veces");
	}
		
		
}

