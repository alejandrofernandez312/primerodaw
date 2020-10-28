package First;

import java.util.Scanner;

public class TablasMultiplicarDesc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("¿Qué tabla quieres saber?");
		int number = input.nextInt();
		
		
		for (int i=1; i<=number; i++) {
			System.out.println("Tabla del "+ i);
			for (int j=1; j<=10; j++) {
				System.out.println("\t"+i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
		
		

	}

}
