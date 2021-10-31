package exercicio.adapter.map;

public class AccessToMainFrame {
	private boolean access;
	public boolean prepareMainFrame() {
		return access= true;
	}
	
	public void doComand(String cmd) {
		access = false;
		System.out.println(cmd);
	}
}
