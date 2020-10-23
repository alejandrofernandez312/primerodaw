package first;

import java.util.Scanner;

public class SumasHasta0 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
				
		System.out.println("Escribe un número:");
		int number = input.nextInt();
		int sum = 0;
		
			while (number != 0) {
				sum+=number;
				System.out.println("Escribe otro número:");
				number= input.nextInt(); 
			}
			System.out.println("El resultado es " + sum);
	}
}
