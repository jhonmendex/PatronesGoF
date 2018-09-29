package inv.logica.patrones.comportamiento.cadena;

/** @author Sandro Bola�os */

public class Proceso {
	AActividad actividad;

	public Proceso(AActividad actividad) {
		super();
		this.actividad = actividad;
	}

	public void ejecutar(Artefacto artefacto) {
		actividad.resolver(artefacto);
	}
}
