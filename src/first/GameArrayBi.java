package first;

import java.util.Scanner;

public class GameArrayBi {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Dimensión para el mapa:");
		int dimension= input.nextInt();
		
		int [][]map=createMap(dimension);
		System.out.println(maptoString(map));
		jugar(dimension);

	}
	
	public static void jugar(int dimension) {
		System.out.println("Utiliza W,A,S,D para moverte!");
		char mover=input.next().toUpperCase().charAt(0);
		mover(mover);
	}
	
	public static void mover(char mover) {
		switch (mover) {
		case 'W':
			
			break;
		}
	}
	
	public static int[][]createMap(int d){
		int [][]map=new int [d][d];
		for(int f=0;f<map.length;f++)
			for (int c=0;c<map[f].length;c++)
				if (f==0 || c==0|| f==d-1 || c==d-1)
					map[f][c]=1;
				else
					map[f][c]=0;
		map [d/2][d/2]=5;
		return map;
	}
	
	public static String maptoString(int [][] map) {
		String mapString="";
		for (int f=0;f<map.length;f++) {
			mapString +="\n";
			for (int c=0;c<map[f].length;c++)
				mapString+=" "+map[f][c];
		}
		return mapString;
	}

}
