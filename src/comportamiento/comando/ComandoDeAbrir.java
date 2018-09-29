package inv.logica.patrones.comportamiento.comando;

/** @author Sandro Bolaños */

public class ComandoDeAbrir implements IComando {

	Aplicacion aplicacion;
	
	public ComandoDeAbrir(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}

	@Override
	public void ejecutar() {
		aplicacion.abrir();
	}

}
