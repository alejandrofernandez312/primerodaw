package first;

import java.util.Scanner;

public class EjercicioMenu {

	public static void main(String[] args) {
		int op;
		Scanner input = new Scanner (System.in);
		// TODO Auto-generated method stub
		do {
			System.out.println("\t\t\tMenu");
			System.out.println("-------------------------------------------------");
			System.out.println("\t1-.Generate numerical character ('0'-'9')");
			System.out.println("\t2-.Generate lowcase characters ('a'-'z')");
			System.out.println("\t3-.Generate uppercase characters ('A'-'Z')");
			System.out.println("\t4-.Exit");
			System.out.println();
			System.out.println("Elige una opción:");
			op = input.nextInt();
			switch (op) {
			case 1:
			System.out.println(numericalCharacter());break;
			case 2:
				System.out.println(lowcaseCharacter());break;
			case 3:
				System.out.println(upperCharacter());break;
			}
			
		}while (op!=4);

	}
	
	public static int numericalCharacter() {
		int a = (int)(Math.random()*10);
		System.out.println("El número es: ");
		return a;
		
	}
	
	public static char lowcaseCharacter() {
		int n=97 + (int)(Math.random()*25);
		char nu=(char)n;		
		return nu;
		
	}
	
	public static char upperCharacter() {
		int n=65 + (int)(Math.random()*25);
		char nu=(char)n;		
		return nu;
		
	}

}
