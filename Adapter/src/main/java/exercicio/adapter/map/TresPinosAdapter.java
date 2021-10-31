package exercicio.adapter.map;

public class TresPinosAdapter implements TresPinos{
	DoisPinos dp = new DoisPinos();

	public void ligar() {
		dp.turnOn();
		
	}

	public void desligar() {
		dp.turnOff();
	}
	
	
	

}
