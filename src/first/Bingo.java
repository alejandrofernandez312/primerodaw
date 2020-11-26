package First;

import java.util.Scanner;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int [] array=new int [15];
		Scanner input = new Scanner(System.in);
		int op;
		do {
			op = menu();
			switch (op) {
			case 1:
				valores(array);
				System.out.println();
				break;
			case 2:
				printarray(array);
				System.out.println();
				System.out.println();
				break;
			
			case 3:
				printarray(ordenar(array));
				System.out.println();
				System.out.println();
			}
		} while (op != 4);
		
		
		
		
	}
	
	public static int menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("\t1.-Dar valores al array");
		System.out.println("\t2.-Ver array");
		System.out.println("\t3.-Ver array ordenado");
		System.out.println("\t4.-Salir");
		System.out.println("\t\tOpción:");
		int op = input.nextInt();
		return op;
	}
	
	public static int [] valores(int[]array) {
		for (int i=0;i<array.length;i++) {
			array[i]=(int)(Math.random()*99)+1;
		}
		return array;
	}
	
	public static void printarray(int[]array) {
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+"   ");
		}
	}
	
	public static int [] ordenar(int[]array) {
		for (int i=0;i<array.length;i++) {
			for (int j=array.length-2;j>=i;i--) {
				if (array[j]>array[j+1]) {
					int aux=array[j];
					array[j]=array[j+1];
					array[j+1]=aux;
				}
			}
		}
		return array;
	}

}
