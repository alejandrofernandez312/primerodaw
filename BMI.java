package First;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Escribe el peso en kg:");
		double peso = input.nextDouble();
		
		System.out.println("Escribe la altura en metros:");
		double altura = input.nextDouble();
		
		double bmi = peso / (Math.pow(altura, 2));
		
		if (bmi <= 18.5) {
			System.out.println("Tu BMI es " + bmi + ", tienes poco peso.");
		}
		
		else
			if (bmi <= 25.0) {
				System.out.println("Tu BMI es " + bmi + ", tienes un peso normal.");
			}
			else 
				if (bmi <= 30.0) {
					System.out.println("Tu BMI es " + bmi + ", tienes sobrepeso.");
				}
				else
					if (bmi > 30) {
						System.out.println("Tu BMI es " + bmi + ", tienes obesidad.");
					}
		
		
		
		

	}

}
