package first;

import java.util.Scanner;

public class BarajadeCartas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] barajanueva = nuevabaraja();	
		Scanner input = new Scanner (System.in);
		String [] barajaconpalos=barajaconpalos(barajanueva);
		int op;
		
		do {
			menu();
			System.out.println("Elige un número:");
			op=input.nextInt();
			switch (op) {
			case 1:
				System.out.println("Estos son los números ordenados");
				System.out.println();
				printarray(barajanueva);
				break;
			case 2: 
				System.out.println("Esta es la baraja ordenada");
				System.out.println();
				printbaraja(barajaconpalos);
				
			}
		}while(op!=3);

	}
	
	
	public static String [] barajaconpalos(int []barajanueva) {
		String [] resultado=new String [40];
		int b=0;
		int c=0;
		int e=0;
		for (int i=0;i<barajanueva.length;i++) {
			if (barajanueva[i]<=10) {
				resultado[i]=barajanueva[i]+" de oros";
			}else if (barajanueva[i]<=20) {
				resultado[i]=barajanueva[b]+" de basto";
				b++;
			}else if (barajanueva[i]<=30) {
				resultado[i]=barajanueva[c]+" de copas";
				c++;
			}else if (barajanueva[i]<=40) {
				resultado[i]=barajanueva[e]+" de espadas";
				e++;
			}
		}
		return resultado;
		
	}
	

	public static int[] nuevabaraja() {
		int [] baraja= new int [40];
		int z = 1;
		for (int i = 0; i < baraja.length; i++) {
			baraja[i] = z;
			z++;
		}
		return baraja;
	}

	public static void printarray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i % 10 != 0)
				System.out.print("\t" + array[i] + " ");
			else
				System.out.print("\n" + array[i] + " ");

		}
		System.out.println();
		System.out.println();
	}
	
	public static void printbaraja(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i % 10 != 0)
				System.out.print("\t" + array[i] + " ");
			else
				System.out.print("\n" + array[i] + " ");

		}
		System.out.println();
		System.out.println();
	}
	
	public static void menu() {
		System.out.println("1.-Ver números ordenados");
		System.out.println("2.-Ver baraja ordenada");
	}
}
