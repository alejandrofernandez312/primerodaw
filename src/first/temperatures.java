package first;

import java.util.Scanner;

public class temperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fahr;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce los grados Fahrenheit que quieres pasar a °C:");
		fahr = input.nextDouble();
		
		double celsius = (5.0/9)*(fahr - 32);
		
		System.out.println(celsius + "°C");
				

	}

}
