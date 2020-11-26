package first;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int [] array=new int [15];
		valores(array);
		printarray(array);
		
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
