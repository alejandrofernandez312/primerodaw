package First;

import java.util.Scanner;

public class Hextodec {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Escribe un número hexadecimal: ");
		String hexString = input.nextLine();
		char ch = Character.toUpperCase(hexString.charAt(0));
		
		
		//El usuario tiene que escribir un carácter
		if (hexString.length() != 1) {
			System.out.println("Tienes que escribir un carácter al menos.");
			System.exit(1);
		}
		
		
		//Pasar el carácter a mayúsculas
		
		else if ('A' <= ch && ch <= 'F') {
			int value = ch - 'A' + 10;
			System.out.println("El número decimal de " + ch + " es " + value);
		}

		else if (Character.isDigit(ch)) {
		      System.out.println("The decimal value for hex digit " 
		    	        + ch + " is " + ch);
		}
		else {
		      System.out.println(ch + " is an invalid input");
		    }
	}

}
