package first;

import java.util.Scanner;

public class ToMinutes {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int seg;
		
		System.out.print ("Escribe un número de segundos para convertir a minutos: ");
		seg = input.nextInt();
		
		int resultm = seg / 60;
		int results = seg % 60 ;
		int resulth = seg / 3600;
		int rseconds = seg % 3600;
		int totalh = resultm % 60 + resulth;
		System.out.print(totalh + " horas " + resultm + " minutos " + results + " segundos");
		
	}

}
