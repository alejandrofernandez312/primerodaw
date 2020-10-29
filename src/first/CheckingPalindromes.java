package first;

import java.util.Scanner;

public class CheckingPalindrome {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("Introduce una palabra:");
		String word=input.next();
		
		int low=0;
		int high=word.length()-1;
		
		System.out.println("La palabra es: "+ word);
		
		while (word.charAt(low)==word.charAt(high)&&low<=high) {
			++low;
			--high;
		}
		if (low>high) {
			System.out.println("La palabra "+word+" es palíndroma.");
		}
		else {
			System.out.println("La palabra "+word+" no es palíndroma.");
		}

	}

}
