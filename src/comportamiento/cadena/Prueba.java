package inv.logica.patrones.comportamiento.cadena;

/** @author Sandro Bolaños */

public class Prueba {
	
	public void probar(){
		Artefacto artefacto = new Artefacto(Artefacto.NO_ES_ARTEFACTO_DE_SOFTWARE, "No es artefacto sw");
		new Proceso(new Especificacion(new Desarrollo(new Mantenimiento(null)))).ejecutar(artefacto);
		Artefacto entregable = new Artefacto(Artefacto.ARTEFACTO_DE_DESARROLLO, "es una liberacion");
		new Proceso(new Especificacion(new Desarrollo(new Mantenimiento(null)))).ejecutar(entregable);
	}

	public static void main(String[] args) {
		new Prueba().probar();
	}

}
