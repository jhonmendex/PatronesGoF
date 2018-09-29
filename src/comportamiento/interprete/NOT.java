package inv.logica.patrones.comportamiento.interprete;

/** @author Sandro Bolaños */

public class NOT extends ASimple {

	AExpresion p;
	
	public NOT(AExpresion p) {
		this.p = p;
	}

	@Override
	public boolean evaluar(Situacion situacion) {
		return !p.evaluar(situacion);
	}

}
