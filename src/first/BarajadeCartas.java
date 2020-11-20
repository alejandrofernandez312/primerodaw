package first;

public class BarajadeCartas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] baraja = new int[40];
		int[] barajanueva = nuevabaraja(baraja);
		printarray(barajanueva);

	}

	public static int[] nuevabaraja(int[] baraja) {
		int z = 1;
		for (int i = 0; i < baraja.length; i++) {
			baraja[i] = z;
			z++;
		}
		return baraja;
	}

	public static void printarray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i % 10 != 0)
				System.out.print("\t" + array[i] + " ");
			else
				System.out.print("\n" + array[i] + " ");

		}
	}
}
