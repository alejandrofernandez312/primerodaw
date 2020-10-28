package First;

import java.util.Scanner;

public class MaximoComunDiv {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Escribe el primer número:");
		int number1=input.nextInt();
		System.out.println("Escribe el segundo número:");
		int number2=input.nextInt();
		
		/* int d = number1<number2?number1:number2;
		
		while (number1 % d !=0 || number2 % d !=0)
			d--; */
		
		int d;
		for (d = number1<number2?number1:number2; (number1 % d !=0 || number2 % d !=0); d--);
		
		System.out.println("El máximo común divisor entre "+ number1 + " y " + number2 + " es " + d);

	}

}
