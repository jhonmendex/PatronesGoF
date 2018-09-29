package inv.logica.patrones.comportamiento.cadena;

/** @author Sandro Bolaños */

public class Artefacto {
	public final static int NO_ES_ARTEFACTO_DE_SOFTWARE=0;
	public final static int ARTEFACTO_DE_ESPECIFICACION=1;
	public final static int ARTEFACTO_DE_DESARROLLO=2;
	public final static int ARTEFACTO_DE_MANTENIMIENTO=3;
	
	int topico = NO_ES_ARTEFACTO_DE_SOFTWARE;
	String descripcion;

	public Artefacto(int topico, String descripcion) {
		super();
		this.topico = topico;
		this.descripcion = descripcion;
	}

	public int getTopico() {
		return topico;
	}

	public void setTopico(int topico) {
		this.topico = topico;
	}
}
