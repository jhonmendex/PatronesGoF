package inv.logica.patrones.comportamiento.comando;

/** @author Sandro Bola�os */

public class ComandoDeCrear implements IComando {

	Aplicacion aplicacion;
	
	public ComandoDeCrear(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

	@Override
	public void ejecutar() {
		aplicacion.crear();
	}

}
