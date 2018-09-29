package inv.logica.patrones.comportamiento.cadena;

/** @author Sandro Bolaños */

public class Mantenimiento extends AActividad {

	public Mantenimiento(AActividad sgte) {
		super(sgte);
	}

	@Override
	public void resolver(Artefacto artefacto) {
		if (artefacto.getTopico() == Artefacto.ARTEFACTO_DE_MANTENIMIENTO){
			System.out.println("Se resuelve en el mantenimiento");
		}else{
			super.resolver(artefacto);
		}
	}

}
