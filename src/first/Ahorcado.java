package first;

import java.util.Scanner;

public class Ahorcado {
	static int fallo = 0;
	static int dibujo=0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op;
		do {
			op = menu();
			switch (op) {
			case 1:
				ahorcadoesp();
				break;
			case 2:
				ahorcadoeng();
				break;
			}
			

		} while (op != 3);

	}

	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Bienvenido al Ahorcado, ¿en qué idioma quieres jugar?");
		System.out.println("\t1.-Español");
		System.out.println("\t2.-Inglés");
		System.out.println("\t3.-Salir");
		System.out.println("\t\tOpción:");
		int op = input.nextInt();
		return op;
	}
	
	public static void dibujo(int j) {
		switch (j) {
			case 1:
				System.out.println("   +---+");
				System.out.println("   |   |");
				System.out.println("   O   |");
				System.out.println("       |");
				System.out.println("       |");
				System.out.println("       |");
				System.out.println("=========");
				break;
			case 2:
				System.out.println("   +---+");
				System.out.println("   |   |");
				System.out.println("   O   |");
				System.out.println("   |   |");
				System.out.println("       |");
				System.out.println("       |");
				System.out.println("=========");
				break;
			case 3:
				System.out.println("   +---+");
				System.out.println("   |   |");
				System.out.println("   O   |");
				System.out.println(" //|   |");
				System.out.println("       |");
				System.out.println("       |");
				System.out.println("=========");
				break;
			case 4:
				System.out.println("   +---+");
				System.out.println("   |   |");
				System.out.println("   O   |");
				System.out.println(" //|\\  |");
				System.out.println("       |");
				System.out.println("       |");
				System.out.println("=========");
				break;
			case 5:
				System.out.println("   +---+");
				System.out.println("   |   |");
				System.out.println("   O   |");
				System.out.println(" //|\\  |");
				System.out.println("   |   |");
				System.out.println(" //    |");
				System.out.println("       |");
				System.out.println("=========");
				break;
			case 6:
				System.out.println("   +---+");
				System.out.println("   |   |");
				System.out.println("   O   |");
				System.out.println(" //|\\  |");
				System.out.println("   |   |");
				System.out.println(" // \\  |");
				System.out.println("       |");
				System.out.println("=========");
				break;
		}
	}

	public static void ahorcadoesp() {
		Scanner input = new Scanner(System.in);
		int count = 0;
		// Coger e imprimir palabra
		String[] missword = { "MONITOR", "MURCIELAGO", "GOMA", "BOTELLA", "TECLADO", "LLAVERO", "VENTANA" }; // {"PATATA","CABALLERO","PELOTA","MONITOR","TECLADO"};
		String palabra = missword[(int) (Math.random() * 5)];
		
		// Crear máscara de guiones con la palabra obtenida
		String report = guiones(palabra);
		System.out.println(report);
		System.out.println();
		quequieres(palabra);
		
	}
	
	public static void ahorcadoeng() {
		Scanner input = new Scanner(System.in);
		int count = 0;
		// Coger e imprimir palabra
		String[] missword = { "WINDOW", "DESKTOP", "HEADSET", "WEBCAM", "SOFTWARE", "MEMORY", "GAME" }; // {"PATATA","CABALLERO","PELOTA","MONITOR","TECLADO"};
		String palabra = missword[(int) (Math.random() * 5)];
		
		// Crear máscara de guiones con la palabra obtenida
		String report = guiones(palabra);
		System.out.println(report);
		System.out.println();
		quequieres2(palabra);
		
	}
	
	public static void quequieres2(String palabra) {
		
		Scanner input = new Scanner(System.in);
		int op;
		String report = guiones(palabra);
		while (fallo < 6) {
			System.out.println("1-.Type a letter");
			System.out.println("2-.Solve word");
			System.out.println("Choose:");
			op = input.nextInt();
			if (op == 1) {
				System.out.println("Type a letter:");
				char letra = escribeunaletra();
				report = compararletra2(palabra, letra, report);	
				
				if (report.replace(" ", "").equals(palabra)) {
					System.out.println("You've won!");
					System.exit(0);
				}
				

			} else if (op == 2) {
				System.out.println("Write a word:");
				String respuesta = input.next();
				comprobarpalabra(palabra.toUpperCase(), respuesta.toUpperCase(), fallo);
				if (comprobarpalabra(palabra.toUpperCase(), respuesta.toUpperCase(), fallo) == false) {
					fallo++;
					dibujo++;
					System.out.println("You have failed!");
					System.out.println("You have " + fallo + " fails out of" + " 6");
					System.out.println();
					System.out.println(report);
				} else {
					System.out.println("You've won!");
					System.exit(0);
				}

			}
		}
		System.out.println();
		System.out.println("You loose!");
		System.out.println("The word was "+palabra);
		System.out.println();
		System.exit(0);

	}

	public static String guiones(String palabra) {
		String report = "";
		for (int i = 0; i < palabra.length(); i++) {
			report += "_ ";
		}
		return report;
	}

	public static void quequieres(String palabra) {
		
		Scanner input = new Scanner(System.in);
		int op;
		String report = guiones(palabra);
		while (fallo < 6) {
			System.out.println("1-.Escribir letra");
			System.out.println("2-.Resolver palabra");
			System.out.println("Elige:");
			op = input.nextInt();
			if (op == 1) {
				System.out.println("Escribe una letra:");
				char letra = escribeunaletra();
				report = compararletra(palabra, letra, report);	
				
				if (report.replace(" ", "").equals(palabra)) {
					System.out.println("¡Has ganado!");
					System.exit(0);
				}
				

			} else if (op == 2) {
				System.out.println("Escribe una palabra:");
				String respuesta = input.next();
				comprobarpalabra(palabra.toUpperCase(), respuesta.toUpperCase(), fallo);
				if (comprobarpalabra(palabra.toUpperCase(), respuesta.toUpperCase(), fallo) == false) {
					fallo++;
					dibujo++;
					dibujo(dibujo);
					System.out.println("¡Has fallado!");
					System.out.println("Llevas " + fallo + " fallo de" + " 6");
					System.out.println();
					System.out.println(report);
				} else {
					System.out.println("¡Has ganado!");
					System.exit(0);
				}

			}
		}
		System.out.println();
		System.out.println("¡Has perdido!");
		System.out.println("La palabra era "+palabra);
		System.out.println();
		System.exit(0);

	}

	public static char escribeunaletra() {
		Scanner input = new Scanner(System.in);
		String letra = input.next().toUpperCase();
		char letraa = letra.charAt(0);
		return letraa;
	}

	public static boolean comprobarpalabra(String palabra, String respuesta, int fallo) {
		boolean comprobar = true;
		fallo = 0;
		if (palabra.equals(respuesta) ) {
			//System.out.println("¡Has ganado!");
			comprobar = true;

		} else {
			fallo++;
			comprobar = false;
		}
		return comprobar;
	}

	public static String compararletra(String palabra, char letra, String report) {
		int contador = 0;
		char[] arrayreport = report.replace(" ", "").toCharArray();
		char[] arraypalabra = palabra.toCharArray();
		for (int i = 0; i < arraypalabra.length; i++) {
			if (letra == arraypalabra[i]) {
				arrayreport[i] = letra;
				contador++;
			}
		}
		if (contador == 0) {
			fallo	++;
			dibujo++;
			dibujo(dibujo);
			System.out.println("¡Has fallado!");
			System.out.println("Llevas " + fallo + " fallo de" + " 6");
			System.out.println();
		} else { System.out.println("Llevas " + fallo + " fallo de" + " 6");
		System.out.println();}
		String nuevamascara = "";
		for (int i = 0; i < arrayreport.length; i++) {
			nuevamascara += arrayreport[i] + " ";
		}
		System.out.println(nuevamascara);
		return nuevamascara;
		
	}
	
	public static String compararletra2(String palabra, char letra, String report) {
		int contador = 0;
		char[] arrayreport = report.replace(" ", "").toCharArray();
		char[] arraypalabra = palabra.toCharArray();
		for (int i = 0; i < arraypalabra.length; i++) {
			if (letra == arraypalabra[i]) {
				arrayreport[i] = letra;
				contador++;
			}
		}
		if (contador == 0) {
			fallo	++;
			dibujo++;
			System.out.println("You have failed!");
			System.out.println("You have " + fallo + " fails out of" + " 6");
			System.out.println();
		} else { System.out.println("You have " + fallo + " fails out of" + " 6");
		System.out.println();}
		String nuevamascara = "";
		for (int i = 0; i < arrayreport.length; i++) {
			nuevamascara += arrayreport[i] + " ";
		}
		System.out.println(nuevamascara);
		return nuevamascara;
		
	}
}
