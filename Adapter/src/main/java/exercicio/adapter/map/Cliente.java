package exercicio.adapter.map;

public class Cliente {
	public static void main(String[] args) {
		AccessToMainFrameAdapter atm = new AccessToMainFrameAdapter();
		atm.armazenarDado("INSERT");
		
		TresPinosAdapter tp = new TresPinosAdapter();
		tp.ligar();
		tp.desligar();
	
	}

}
