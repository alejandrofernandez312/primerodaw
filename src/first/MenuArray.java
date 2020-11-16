package First;

import java.util.Scanner;

public class MenuArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int op;
		String printarray = "";
		String printarray1 = "";

		do {
			menu();
			System.out.println();
			System.out.println("Elige un número:");
			op = input.nextInt();

			switch (op) {
			case 1:
				System.out.println("¿Cuántos valores quieres que tenga el array?");
				int n = input.nextInt();
				int[] array = new int[n];
				for (int i = 0; i < n; i++) {
					System.out.println("Teclea un valor para la celda " + i + ":");
					int valor = input.nextInt();
					array[i] = valor;
				}
				for (int i = 0; i < n; i++) {
					printarray += " " + array[i];
				}
				break;
			case 2:
				System.out.println("¿Cuántos valores quieres que tenga el array?");
				n = input.nextInt();
				int[] miarray = new int[n];
				for (int i = 0; i < n; i++) {
					int valor = (int) (Math.random() * 10) + 1;
					miarray[i] = valor;
					i++;
				}
				for (int i = 0; i < n; i++) {
					printarray1 += " " + miarray[i];
				}
				break;
			case 3:
				System.out.println(printarray);
				System.out.println(printarray1);
				break;
			case 4:
				
			}

		} while (op != 9);

	}

	public static void menu() {
		System.out.println("\t\tMenu");
		System.out.println("-------------------------------------");
		System.out.println("\t1.-Initializing arrays with input values");
		System.out.println("\t2.-Initializing arrays with random values");
		System.out.println("\t3.-Printing arrays");
		System.out.println("\t4.-Summing all elements");
		System.out.println("\t5.-Finding the largest element");
		System.out.println("\t6.-Finding the smallest index of the largest element");
		System.out.println("\t7.-Random shuffling");
		System.out.println("\t8.-Shifting elements");
		System.out.println("\t9.-Exit");
	}

	
}
