package first;

import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);

		System.out.println("Precio:");
		double total = input.nextDouble();
		double totalprice = (int)(total *1.20*100)/100.0;
		
		
		System.out.println("Total:" + totalprice);

	}

}
