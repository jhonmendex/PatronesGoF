package inv.logica.patrones.comportamiento.observador;

/** @author Sandro Bola�os */

public class Temperatura extends ASintoma {
	int temperatura;
	public Temperatura(int temperatura) {		
		this.temperatura = temperatura;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}       
}
