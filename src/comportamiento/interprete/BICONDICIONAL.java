package inv.logica.patrones.comportamiento.interprete;

/** @author Sandro Bolaños */

public class BICONDICIONAL extends ACompuesto {

	ENTONCES p_entonces_q;
	ENTONCES q_entonces_p;
	AND peq_and_qep;
	
	public BICONDICIONAL(AExpresion p, AExpresion q) {
		super(p, q);
		p_entonces_q = new ENTONCES(p, q);
		q_entonces_p = new ENTONCES(q, p);
		peq_and_qep = new AND(p_entonces_q, q_entonces_p);
	}

	@Override
	public boolean evaluar(Situacion situacion) {
		return peq_and_qep.evaluar(situacion);
	}

}
