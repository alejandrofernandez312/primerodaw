package first;


public class CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long millis = System.currentTimeMillis();
		
		long segundos = millis / 1000;
		long CurrentSegundos = segundos % 60;
		
		long minutos = segundos / 60;
		long CurrentMinutos = minutos % 60;
		
		long horas = minutos /60;
		long CurrentHoras = (horas % 24) +2;
		
		
		System.out.println(CurrentHoras + ":" + CurrentMinutos + ":" + CurrentSegundos);
		
		
		// System.out.println(hour +":"+min+":"+millis);
	}

}
