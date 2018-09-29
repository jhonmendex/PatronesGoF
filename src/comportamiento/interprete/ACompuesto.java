package inv.logica.patrones.comportamiento.interprete;

/** @author Sandro Bola�os */

public abstract class ACompuesto extends AExpresion {

	AExpresion p;
	AExpresion q;
	
	public ACompuesto(AExpresion p, AExpresion q) {
		this.p = p;
		this.q = q;
	}
	
}
