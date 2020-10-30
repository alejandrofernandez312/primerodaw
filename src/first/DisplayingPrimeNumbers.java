package first;

public class DisplayingPrimerNumbers {

	public static void main(String[] args) {
		
		int counter = 0;
		int number = 0;
		String report="";
		System.out.println("First 50 Prime Numbers:");
		
		while (counter<50) {
			number++;
			int d=2;
			
			while (d < (number/2) && (number % d !=0)) 
				d++;
				
				if (number % d !=0 || number==2) {
					report += "\t" + number;
					counter++;
					if (counter % 10 == 0) {
						report += "\n";
					}
				}
				
		}
		
		System.out.println(report);
	}
	
		
}
