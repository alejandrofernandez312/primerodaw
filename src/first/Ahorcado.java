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
		String [] palabra = {"PATATA","CABALLERO","PELOTA","MONITOR","TECLADO"};
		String palabraajugar=palabrajugar(palabra);
		System.out.println(palabraajugar);
		guiones(palabraajugar);
		
		
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
