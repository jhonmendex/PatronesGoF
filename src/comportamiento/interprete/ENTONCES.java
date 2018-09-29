package inv.logica.patrones.comportamiento.interprete;

/** @author Sandro Bolaños */

public class ENTONCES extends ACompuesto {
	
	NOT notP;
	OR notP_or_q;
	
	public ENTONCES(AExpresion p, AExpresion q) {
		super(p, q);
		notP = new NOT(p);
		notP_or_q = new OR(notP, q);
	}

	@Override
	public boolean evaluar(Situacion situacion) {
		return notP_or_q.evaluar(situacion);
	}

}
