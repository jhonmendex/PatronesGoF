package inv.logica.patrones.comportamiento.interprete;

/** @author Sandro Bolaños */

public class Proposicion extends AExpresion {
	Situacion situacion;
	
	public Proposicion(Situacion situacion) {
			this.situacion = situacion;
	}

	@Override
	public boolean evaluar(Situacion situacion) {
		return situacion.getSentencia().contains(this.situacion.getSentencia()) &&
				this.situacion.isValor();
	}

}
