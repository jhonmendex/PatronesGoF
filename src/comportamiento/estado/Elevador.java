package inv.logica.patrones.comportamiento.estado;

/** @author Sandro Bola�os */

public class Elevador {
	AEstado estado;
	public Elevador(AEstado estado) {		
		this.estado = estado;
	}
	public void recibirPiso(int pisoPedido) {
		while(!((estado = estado.moverse(pisoPedido)) instanceof Detenido));
	}
}
