package inv.logica.patrones.comportamiento.interprete;

/** @author Sandro Bola�os */

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
