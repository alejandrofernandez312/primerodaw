package games;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Bombo {
	private ArrayList<Integer>bombo;
	
	public Bombo() {
		bombo=new ArrayList<Integer>();
		this.setBombo();
	}
	
	public int getNext() {
		if(this.bombo.isEmpty())
			return -1;
		else {
			Random ale= new Random();
			int r=ale.nextInt(bombo.size());
			int n= this.bombo.get(r);
			this.bombo.remove(r);
			return n;
		}
	}
	
	public boolean isEmpty() {
		if(this.bombo.size()==0)
			return true;
		return false;
	}
	
	public void setBombo() {
		for(int i=1;i<100;i++)
			bombo.add(i);
		Collections.shuffle(bombo);
	}

}
