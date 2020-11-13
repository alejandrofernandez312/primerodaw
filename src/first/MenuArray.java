package first;

import java.util.Scanner;

public class MenuArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int op;
		
		do {
			menu();
			System.out.println();
			System.out.println("Elige un número:");
			op =input.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("¿Cuántos valores quieres que tenga el array?");
				int n = input.nextInt();
				int [] array= new int[n];
				for (int i=0;i<n;i++) {
					System.out.println("Teclea un valor para la celda "+i+":");
					int valor=input.nextInt();
					array[i]=valor;
					i++;
				}
				break;
			case 2:
				System.out.println("El array va a tener un número random de valores del 1 al 10.");
				int c=(int)(Math.random()*10)+1;
				int [] array2= new int[c];
				System.out.println("En este caso el array tiene "+c+" valores.");
			}
			
			
		}while(op!=9);

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
	}
	

}
