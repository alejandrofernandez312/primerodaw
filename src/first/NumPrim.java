package first;

import java.util.Scanner;

public class NumPrimo {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce un número:");
		int number = input.nextInt();
		int cont = 0;
		int x = 1;
		
		
		while (x<=number) {
			if (number % x==0) {
				cont++;
				}
			x++;
		}
		if (cont == 2) {
			System.out.println(number + " es un número primo.");
			
		}
		else {
			System.out.println(number + " no es un número primo.");
		}

			}
		}
			
	
