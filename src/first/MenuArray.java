package First;

import java.util.Scanner;

public class MenuArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int op;

		int[] array = null;

		do {
			menu();
			System.out.println();
			System.out.println("Elige un número:");
			op = input.nextInt();

			switch (op) {
			case 1:
				array = inputarray();
				break;
			case 2:
				array = randomarray();
				break;
			case 3:
				System.out.println(printarray(array));
				break;
			case 4:
				System.out.println("La suma de " + printarray(array) + " es " + sumarray(array));
				break;
			case 5:
				System.out.println("El valor más alto de " + printarray(array) + " es " + largest(array));
				break;
			case 6:
				System.out.println(
						"El índice más pequeño del valor más alto de " + printarray(array) + " es " + smallest(array));
				break;
			case 7:
				System.out.println("Al barajar " + printarray(array) + " queda " + randomshuf(array));
			}

		} while (op != 8);

	}

	public static String randomshuf(int[] array) {
		String report = "";
		for (int i = 0; i < array.length; i++) {
			int r = (int) (Math.random() * array.length);
			int aux = array[i];
			array [i]=array[r];
			array [r]=aux;
		}
		for (int i=0;i < array.length; i++)
			report+=" "+array[i];
		return report;

	}

	public static int sumarray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static int smallest(int[] array) {
		int max = 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				index = i;
			}

		}
		return index;
	}

	public static int largest(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
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
		System.out.println("\t8.-Exit");
	}

	public static int[] inputarray() {
		Scanner input = new Scanner(System.in);
		System.out.println("¿Cuántos valores quieres que tenga el array?");
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Teclea un valor para la celda " + i + ":");
			int valor = input.nextInt();
			array[i] = valor;
		}
		return array;
	}

	public static int[] randomarray() {
		Scanner input = new Scanner(System.in);
		System.out.println("¿Cuántos valores quieres que tenga el array?");
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			int valor = (int) (Math.random() * 100) + 1;
			array[i] = valor;
		}
		return array;
	}

	public static int[] arrayrandom() {
		Scanner input = new Scanner(System.in);
		System.out.println("¿Cuántos valores quieres que tenga el array?");
		int n = input.nextInt();
		int[] miarray = new int[n];
		for (int i = 0; i < n; i++) {
			int valor = (int) (Math.random() * 10) + 1;
			miarray[i] = valor;
			i++;
		}
		return miarray;
	}

	public static String printarray(int[] array) {
		String report = "";
		for (int i = 0; i < array.length; i++) {
			report += " " + array[i];
		}
		return report;
	}
}
