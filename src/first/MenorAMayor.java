package first;

public class MenorAMayor {

	public static void main(String[] args) {

		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		int c = (int)(Math.random()*100);
		
		System.out.println("Los números obtenidos son " + a + ", " + b + " y " + c);
		
		
		if (a > b) {
			if (a > c)
				if(b > c) 
					System.out.println(a + ">" + b + ">" + c);
				}
			}
		}
