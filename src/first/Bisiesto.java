package First;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Escribe el año:");
		int year = input.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)){
			System.out.println(year + " es un año bisiesto.");
			
		}
		else
			System.out.println(year + " no es un año bisiesto.");

	}

}
