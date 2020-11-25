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
		int count=0;
		//Coger e imprimir palabra
		String [] missword = {"CACA","MOCO","BOCA","LACA","PELO"}; //{"PATATA","CABALLERO","PELOTA","MONITOR","TECLADO"};
		String palabra=missword[(int)(Math.random()*5)];
		System.out.println(palabra);
		//Crear máscara de guiones con la palabra obtenida
		String report=guiones(palabra);
		System.out.println(report);
		System.out.println();
		while (count<6) {
			quequieres(palabra);
			System.out.println("Tienes "+count+"/6 fallos");
			
		}
		
	}
	
	public static String guiones(String palabra) {
		String report="";
		for(int i=0;i<palabra.length();i++) {
			report+="_ ";
		}
		return report;
	}
	
	public static void quequieres(String palabra) {
		int fallo=0;
		Scanner input = new Scanner(System.in);
		int op;
		String report=guiones(palabra);
		while (fallo<6) {
			System.out.println("1-.Escribir letra");
			System.out.println("2-.Resolver palabra");
			System.out.println("Elige:");
			op=input.nextInt();
			if (op==1) {
				System.out.println("Escribe una letra:");
				char letra=escribeunaletra();
				compararletra(palabra,letra,report,fallo);
				System.out.println(compararletra(palabra,letra,report,fallo));
				report=compararletra(palabra,letra,report,fallo);
				
			}else if (op==2) {
				System.out.println("Escribe una palabra:");
				String respuesta=input.next();
				if (respuesta.toUpperCase()==palabra) {
					System.out.println("¡Enhorabuena, has ganado!");
				}else quequieres(palabra);
			}
			
		}
		
	}
	
	
	public static char escribeunaletra() {
		Scanner input = new Scanner(System.in);
		String letra=input.next().toUpperCase();
		char letraa=letra.charAt(0);
		return letraa;
	}
	
	public static String compararletra(String palabra, char letra, String report, int count){
		int contador=0;
		char [] arrayreport =report.replace(" ", "").toCharArray();
		char [] arraypalabra =palabra.toCharArray();
		for (int i=0;i<arraypalabra.length;i++) {
			if (letra==arraypalabra[i]) {
				arrayreport[i]=letra;
				contador++;
			}
		}
			if (contador==0) {
			count++;
		}
			String nuevamascara="";
		for (int i=0;i<arrayreport.length;i++) {
			nuevamascara+=arrayreport[i]+" ";
		}
			
		return nuevamascara;
	}
}


