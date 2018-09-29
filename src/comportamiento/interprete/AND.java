package inv.logica.patrones.comportamiento.interprete;

/** @author Sandro Bolaños */

public class AND extends ASimple {

	AExpresion p;
	AExpresion q;
	
	public AND(AExpresion p, AExpresion q) {
		this.p = p;
		this.q = q;
	}

	@Override
	public boolean evaluar(Situacion situacion) {
		return p.evaluar(situacion) && q.evaluar(situacion);
	}

}
