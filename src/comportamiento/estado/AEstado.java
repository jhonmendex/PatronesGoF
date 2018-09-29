package inv.logica.patrones.comportamiento.estado;

/** @author Sandro Bolaños */

public abstract class AEstado {
	int pisoActual;
	public AEstado(int pisoActual) {		
		this.pisoActual = pisoActual;
	}
	public abstract AEstado moverse(int pisoPedido);
}
