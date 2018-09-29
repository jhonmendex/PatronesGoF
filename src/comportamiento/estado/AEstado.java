package inv.logica.patrones.comportamiento.estado;

/** @author Sandro Bola�os */

public abstract class AEstado {
	int pisoActual;
	public AEstado(int pisoActual) {		
		this.pisoActual = pisoActual;
	}
	public abstract AEstado moverse(int pisoPedido);
}
