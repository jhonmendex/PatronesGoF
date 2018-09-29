package inv.logica.patrones.comportamiento.estado;

/** @author Sandro Bolaños */

public class Subiendo extends AEstado {
	public Subiendo(int pisoActual) {
		super(pisoActual);		
	}
	@Override
	public AEstado moverse(int pisoPedido) {
		return pisoPedido==pisoActual?new Detenido(pisoActual):subir();		
	}
	private AEstado subir() {
		System.out.println("subiendo al "+ ++pisoActual);
		return this;
	}
}
