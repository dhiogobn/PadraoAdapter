package exercicio.adapter.map;

public class AccessToMainFrameAdapter implements ArmazenamentoApp {

	AccessToMainFrame atm = new AccessToMainFrame();
	public void armazenarDado(String dado) {
		atm.prepareMainFrame();
		atm.doComand(dado);

	}

}
