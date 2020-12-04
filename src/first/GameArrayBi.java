package first;

import java.util.Scanner;

public class GameArrayBi {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Dimensión para el mapa:");
		int dimension = input.nextInt();

		int[][] map = createMap(dimension);
		System.out.println(maptoString(map));
		jugar(dimension, map);

	}

	public static void jugar(int dimension, int[][] map) {
		System.out.println("Utiliza W,A,S,D para moverte:");
		char mover = input.next().toUpperCase().charAt(0);
		mover(mover, map);
		System.out.println(maptoString(map));
	}

	public static int[][] mover(char mover, int[][] map) {
		switch (mover) {
		case 'W':
			for (int i = 0; i < map.length; i++) {
				for (int c = 0; c < map[i].length; c++)
					if (map[i][c] == 5) {
						if (map[i - 1][c] == 6) {
							map[i - 1][c] = 5;
							map[i][c] = 0;
							System.out.println(maptoString(map));
							System.out.println("¡Has ganado!");
							System.exit(0);
						} else if (map[i - 1][c] != 1) {
							map[i - 1][c] = 5;
							map[i][c] = 0;
							return map;
						} else {
							System.out.println("¡Has chocado con una roca, no puedes seguir hacia arriba!");
						}
					}
			}
		}
		return map;
	}

	public static int[][] mover5(int[][] map) {

		return map;
	}

	public static int[][] createMap(int d) {
		int[][] map = new int[d][d];
		for (int f = 0; f < map.length; f++)
			for (int c = 0; c < map[f].length; c++)
				if (f == 0 || c == 0 || f == d - 1 || c == d - 1)
					map[f][c] = 1;
				else
					map[f][c] = 0;
		map[d / 2][d / 2] = 5;
		int random = (int) (Math.random() * (d - 2)) + 1;
		int random2 = (int) (Math.random() * (d - 2)) + 1;
		if (map[random][random2] == 5) {
			random = (int) (Math.random() * (d - 2)) + 1;
			random2 = (int) (Math.random() * (d - 2)) + 1;
		}
		map[random][random2] = 6;
		return map;
	}

	public static String maptoString(int[][] map) {
		String mapString = "";
		for (int f = 0; f < map.length; f++) {
			mapString += "\n";
			for (int c = 0; c < map[f].length; c++)
				mapString += " " + map[f][c];
		}
		return mapString;
	}

}
