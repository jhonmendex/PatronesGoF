package inv.logica.patrones.comportamiento.estado;

/** @author Sandro Bolaños */

public class Bajando extends AEstado {
	public Bajando(int pisoActual) {
		super(pisoActual);		
	}
	@Override
	public AEstado moverse(int pisoPedido) {
		return pisoPedido==pisoActual?new Detenido(pisoActual):bajar();		
	}
	private AEstado bajar() {
		System.out.println("bajando  al "+ --pisoActual);
		return this;
	}
}
