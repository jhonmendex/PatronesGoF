package inv.logica.patrones.comportamiento.observador;

/** @author Sandro Bolaños */

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
