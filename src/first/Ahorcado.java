package first;

import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int op;
		do {
			System.out.println("Bienvenido al Ahorcado, ¿en qué idioma quieres jugar?");
			idioma();
			op=input.nextInt();
			switch (op) {
			case 1:
				ahorcadoesp();
			}
			
		}while(op!=3);

	}
	
	public static void idioma(){
		System.out.println("1.-Español");
		System.out.println("2.-Inglés");
		System.out.println("3.-Salir");
	}
	
	public static void ahorcadoesp() {
		Scanner input = new Scanner(System.in);
		String [] palabra = {"PATATA","CABALLERO","PELOTA","MONITOR","TECLADO"};
		String palabraajugar=palabrajugar(palabra);
		System.out.println(palabraajugar);
		guiones(palabraajugar);
		int fallos =0;
		while (fallos!=6) {
			System.out.println("1-.Escribir letra");
			System.out.println("2-.Resolver palabra");
			int op=input.nextInt();
			switch (op) {
			case 1:
				System.out.println("Escribe una letra:");
				String let=input.next();
				let=let.toUpperCase();
				stringaletra(let);
				comparaguiones(palabraajugar,let);
			}
			
		}
		
		
	}
	
	public static void comparaguiones(String palabraajugar, String let) {
		String report="";
		char[]stringachar=new char[palabraajugar.length()];
		for (int i=0;i<palabraajugar.length();i++) {
			stringachar[i]=palabraajugar.charAt(i);
		}
		char letra=let.charAt(0);
		
		char[]arrayletra= {letra};
		
		for (int i=0;i<stringachar.length;i++) {
			if(stringachar[i]==arrayletra[0]) {
				report+=" "+letra;
			} else report+=" _";
		}
		System.out.println(report);
	}
	
	public static void stringaletra(String let) {
		char letra=let.charAt(0);
		
		
	}
	
	public static String palabrajugar(String [] palabra) {
		int i= (int)(Math.random()*5);
		String palabraelegida=palabra[i];
		return palabraelegida;
	}
	
	public static void guiones(String palabraelegida) {
		String report="";
		for(int i=0;i<palabraelegida.length();i++) {
			report+="_ ";
		}
		System.out.println(report);
	}

}
