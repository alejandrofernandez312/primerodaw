package games;

public class TestBombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bombo b1= new Bombo();
		
		int max=100;
		int c=0;
		do {
			if(b1.isEmpty())
				System.out.println("Is empty");
			else
				System.out.println("Next number: "+b1.getNext());
			c++;
		}while(c<max);
		
	}

}
