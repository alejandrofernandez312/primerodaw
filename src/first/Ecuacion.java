package first;

import java.util.Scanner;

public class Ecuacion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Teclee un valor para a:");
		int a = input.nextInt();
		System.out.println("Teclee un valor para b:");
		int b = input.nextInt();
		System.out.println("Teclee un valor para c:");
		int c = input.nextInt();
		
		double d = Math.pow(b, 2) - 4*a*c;
		if (d<0) {
			System.out.println("No real solution");
		}
		else if (d==0) {
			System.out.println(" Una solución:" + (-b/2*a));
		}
		else {
		double x1 = ((-b)+Math.sqrt(d))/2*a;
		double x2 = ((-b)-Math.sqrt(d))/2*a;
		System.out.println("Soluciones: "+x1+""+x2);
		}
		
		

	}

}
