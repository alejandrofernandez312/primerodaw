package First;

import java.util.Scanner;

public class Tuition {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
		
		int i = 1;
		
			for (double tuition = 10000; tuition<20000; tuition= (tuition+(tuition*0.07))) {
				
				System.out.println("El "+i+" año vale "+(int)(tuition *100)/ 100.00+"€");
				i++;
				
			}
		}

}
