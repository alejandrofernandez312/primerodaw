package first;

public class AnalyzeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = generatearray(100);
		double average = averagearray(array);
		int superanmedia = superanmedia(array, average);
		int[] arrayav = arrayavg(array, average, superanmedia);

		for (int i = 0; i < array.length; i++) {
			if (i % 20 != 0)
				System.out.print("\t" + array[i] + " ");
			else
				System.out.print("\n" + array[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("La media de todos los números del array es: " + average);
		System.out.println("En este array hay " + superanmedia + " números que superan la media.");

		for (int i = 0; i < arrayav.length; i++) {
			if (i % 20 != 0)
				System.out.print("\t" + arrayav[i] + " ");
			else
				System.out.print("\n" + arrayav[i] + " ");
		}

	}

	public static int[] arrayavg(int[] array, double av, int superanmedia) {
		int[] arrayaverage = new int[superanmedia];
		int z=0;
		for (int i=0;i<array.length;i++) {
			if(array[i]>av) {
				arrayaverage[z]=array[i];
				z++;
			}
		}
		return arrayaverage;
		}
		

	public static int superanmedia(int[] array, double av) {
		int n = 0;
		for (int i = 0; i < array.length; i++)
			if (array[i] > av)
				n++;
		return n;
	}

	public static int[] generatearray(int n) {
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++)
			numbers[i] = (int) (Math.random() * 11);
		return numbers;
	}

	public static double averagearray(int[] array) {
		double av = 0;
		for (int i = 0; i < array.length; i++) {
			av += array[i];
		}
		return av / array.length;
	}

}
