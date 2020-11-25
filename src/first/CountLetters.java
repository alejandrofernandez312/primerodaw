package first;

public class CountLetters {

	public static void main(String[] args) {
		char [] letras=new char[24];
		for (int i=0;i<letras.length;i++) {
			letras[i]=letrarandom();
		}
		printarray(letras);
		System.out.println();
		counter(letras);

	}
	
	public static void counter(char []letras) {
		char [] comprobar=new char [letras.length];
		for (int i=0;i<letras.length;i++) {
			int counter=0;
			for (int a=0;a<letras.length;a++) {
				if(letras[a]==letras[i]) {
					counter++;
					
				}
				
			}
			System.out.println("La letra "+letras[i]+ " se ha repetido "+counter+" veces");
		}
		
	}
	
		
	
	public static char letrarandom() {
		char letra;
		int a=97;
		int num=(int)(Math.random()*26);
		letra = (char)(a+num);
		return letra;
	}
	
	public static void printarray(char [] letras) {
		for (int i=0;i<letras.length;i++) {
			System.out.print(letras[i]+"   ");
		}
	}

}
