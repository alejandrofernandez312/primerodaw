package First;

import java.util.Scanner;

public class GeneratePassword {

	public static void main(String[] args) {
		int op;
		Scanner input = new Scanner (System.in);
		// TODO Auto-generated method stub
		do {
			System.out.println("\t\t\tMenu");
			System.out.println("-------------------------------------------------");
			System.out.println("\t1-.Generate numerical character password ('0'-'9')");
			System.out.println("\t2-.Generate lowcase characters password ('a'-'z')");
			System.out.println("\t3-.Generate uppercase characters password ('A'-'Z')");
			System.out.println("\t4-.Exit");
			System.out.println();
			System.out.println("Elige una opción:");
			op = input.nextInt();
			switch (op) {
			case 1:
			System.out.println("¿Qué longitud quieres que tenga?");
			int longitud = input.nextInt();
			System.out.println(numericalPassword(longitud));
			break;
			case 2:
				System.out.println("¿Qué longitud quieres que tenga?");
				longitud = input.nextInt();
				System.out.println(lowcasePassword(longitud));
				break;
			case 3:
				System.out.println("¿Qué longitud quieres que tenga?");
				longitud = input.nextInt();
				System.out.println(upperPassword(longitud));
				break;
			}
			
		}while (op!=4);

	}
	
	public static String numericalPassword(int longitud) {
		int i=1;
		String report="";
		
		while (i <= longitud) {
		int a = (int)(Math.random()*10);
		report+=a;
		i++;
		}
		
		
		return report;
		
	}
	
	public static String lowcasePassword(int longitud) {
		int i=1;
		String report="";
		
		while (i <= longitud) {
		int n=97 + (int)(Math.random()*25);
		char nu=(char)n;
		report+=nu;
		i++;
		}
		return report;
		
	}
	
	public static String upperPassword(int longitud) {
		int i=1;
		String report="";
		
		while (i <= longitud) {
		int n=65 + (int)(Math.random()*25);
		char nu=(char)n;	
		report+=nu;
		i++;
		}
		
		return report;
		
	}

}
