package First;

import java.util.Scanner;

public class Ahorcadoo {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int op;
		do {
			op=menu();
			switch (op) {
			case 1:
				ahorcadoesp();
				break;
			}
			
		}while(op!=3);

	}
	
	public static int menu() {
		Scanner input = new Scanner (System.in);
		System.out.println("Bienvenido al Ahorcado, ¿en qué idioma quieres jugar?");
		System.out.println("\t1.-Español");
		System.out.println("\t2.-Inglés");
		System.out.println("\t3.-Salir");
		System.out.println("\t\tOpción:");
		int op=input.nextInt();
		return op;
	}
	
	public static void ahorcadoesp() {
		Scanner input = new Scanner(System.in);
		String [] missword = {"PATATA","CABALLERO","PELOTA","MONITOR","TECLADO"};
		String palabra=missword[(int)(Math.random()*5)];
		System.out.println(palabra);
		guiones(palabra);
		System.out.println();
		quequieres(palabra);
		
	}
	
	public static void guiones(String palabra) {
		String report="";
		for(int i=0;i<palabra.length();i++) {
			report+="_ ";
		}
		System.out.println(report);
	}
	
	public static void quequieres(String palabra) {
		int fallo=0;
		Scanner input = new Scanner(System.in);
		int op;
		while (fallo<6) {
		System.out.println("1-.Escribir letra");
		System.out.println("2-.Resolver palabra");
		System.out.println("Elige:");
		op=input.nextInt();
		
			if (op==1) {
				System.out.println("Escribe una letra:");
				char letra=escribeunaletra();
				String report=compararletra(palabra,letra);
				System.out.println(report);
				
			}else if (op==2) {
				System.out.println("Escribe una palabra:");
			}
		}
		
	}
	
	
	public static char escribeunaletra() {
		Scanner input = new Scanner(System.in);
		String letra=input.next().toUpperCase();
		char letraa=letra.charAt(0);
		return letraa;
	}
	
	public static String compararletra(String palabra, char letra){
		String report="";
		char[]palabraa=new char [palabra.length()];
		for (int i=0;i<palabra.length();i++) {
			palabraa[i]=palabra.charAt(i);
		}
		for (int i=0;i<palabraa.length;i++) {
			if (palabraa[i]==letra) {
				report+=" "+letra;
			}else report+=" _";
		}
		return report;
	}
}

//Tengo que conseguir que se me cambie con las letras ya puestas
