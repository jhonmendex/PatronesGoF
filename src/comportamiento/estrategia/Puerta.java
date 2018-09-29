package inv.logica.patrones.comportamiento.estrategia;

/** @author Sandro Bolaños */

public class Puerta {
	IAcceso acceso;
	public void setAcceso(IAcceso acceso) {
		this.acceso = acceso;
	}
	public Puerta(IAcceso acceso) {		
		this.acceso = acceso;
	}
	public void abrir() {
		acceso.acceder();
	}
}
