package first;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1;
		double num2;
		double num3;
		double media;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe un valor para número 1: ");
		num1 = input.nextDouble();
		System.out.println("Escribe un valor para número 2: ");
		num2 = input.nextDouble();
		System.out.println("Escribe un valor para número 3: ");
		num3 = input.nextDouble();
		
		media = (num1 + num2 + num3) / 3;
		
		System.out.println(media + " es la media de los tres números");

	}

}
