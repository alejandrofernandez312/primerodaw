package first;

import java.util.Scanner;

public class ComputingLoan {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double monthlyPayment;
		double monthlyInterest = 0.3;
		System.out.println("Cuanto dinero desea solicitar:");
		double loanAmount = input.nextDouble();
		System.out.println("Elige los años que quieras de plazo para pagarlo:");
		double years = input.nextDouble();
		
		double pow = years * 12;
		
		monthlyPayment = (loanAmount * monthlyInterest)/(1-(1/((Math.pow( 1 + monthlyInterest, years * 12)))));
		monthlyPayment = (int)(monthlyPayment * 100)/100.0;
		
		System.out.println(monthlyPayment + "€/month");

	}

}
